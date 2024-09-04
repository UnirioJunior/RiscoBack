package com.unirio.Meu.Projeto.Service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.unirio.Meu.Projeto.DataTransferObject.UserDTO;
import com.unirio.Meu.Projeto.Entities.LicencaEntities;
import com.unirio.Meu.Projeto.Entities.UserEntities;
import com.unirio.Meu.Projeto.Entities.UsuarioVerificadorEntity;
import com.unirio.Meu.Projeto.Entities.enums.TipoSituacaoUsuario;
import com.unirio.Meu.Projeto.Repositories.LicencaRepositories;
import com.unirio.Meu.Projeto.Repositories.UserRepository;
import com.unirio.Meu.Projeto.Repositories.UsuarioVerificadorRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository usuarioRepository;
	
	@Autowired
	private UsuarioVerificadorRepository usuarioVerificadorRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
    private LicencaRepositories licencaRepository;
	
	public List<UserDTO> listarTodos(){
		List<UserEntities> usuarios = usuarioRepository.findAll();
		return usuarios.stream().map(UserDTO::new).toList();
	}
	
	public void inserir(UserDTO usuario) {
	    // Extrair o ID da licença do LicencaDTO
	    Long licencaId = usuario.getLicenca().getId(); // Certifique-se de que o LicencaDTO tem o método getId()

	    // Buscar a licença pelo ID
	    LicencaEntities licenca = licencaRepository.findById(licencaId)
	            .orElseThrow(() -> new EntityNotFoundException("Licença não encontrada"));
	    
	    // Criar a entidade de usuário e associar a licença
	    UserEntities usuarioEntity = new UserEntities(usuario);
	    usuarioEntity.setLicenca(licenca);
	    usuarioEntity.setSenha(passwordEncoder.encode(usuario.getSenha()));
	    
	    // Salvar o usuário
	    usuarioRepository.save(usuarioEntity);
	}
	
	public void inserirNovoUsuario(UserDTO usuario) {
		UserEntities usuarioEntity = new UserEntities(usuario);
		usuarioEntity.setSenha(passwordEncoder.encode(usuario.getSenha()));
		usuarioEntity.setSituacao(TipoSituacaoUsuario.PENDENTE);
		usuarioEntity.setId(null);
		usuarioRepository.save(usuarioEntity);
		
		UsuarioVerificadorEntity verificador = new UsuarioVerificadorEntity();
		verificador.setUsuario(usuarioEntity);
		verificador.setUuid(UUID.randomUUID());
		verificador.setDataExpiracao(Instant.now().plusMillis(900000));
		usuarioVerificadorRepository.save(verificador);
		
		//TODO - Enviar um email para verificar a conta
		emailService.enviarEmailTexto(usuario.getEmail(), 
				"Novo usuário cadastrado", 
				"Você está recebendo um email de cadastro o número para validação é " + verificador.getUuid());
		
	}
	
	public String verificarCadastro(String uuid) {
	
		UsuarioVerificadorEntity usuarioVerificacao = usuarioVerificadorRepository.findByUuid(UUID.fromString(uuid)).get();
		
		if(usuarioVerificacao != null) {
			if(usuarioVerificacao.getDataExpiracao().compareTo(Instant.now()) >= 0) {
				
				UserEntities u = usuarioVerificacao.getUsuario();
				u.setSituacao(TipoSituacaoUsuario.ATIVO);
				
				usuarioRepository.save(u);
				
				return "Usuário Verificado";
			}else {
				usuarioVerificadorRepository.delete(usuarioVerificacao);
				return "Tempo de verificação expirado";
			}
		}else {
			return "Usuario não verificado";
		}
		
	}
	
	public UserDTO alterar(UserDTO usuario) {
		UserEntities usuarioEntity = new UserEntities(usuario);
		usuarioEntity.setSenha(passwordEncoder.encode(usuario.getSenha()));
		return new UserDTO(usuarioRepository.save(usuarioEntity));
	}
	
	public void excluir(Long id) {
		UserEntities usuario = usuarioRepository.findById(id).get();
		usuarioRepository.delete(usuario);
	}
	
	public UserDTO buscarPorId(Long id) {
		return new UserDTO(usuarioRepository.findById(id).get());
	}
}
