package com.unirio.Meu.Projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unirio.Meu.Projeto.Entities.PacienteEntities;
import com.unirio.Meu.Projeto.Repositories.PacienteRepositories;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepositories pacienteRepositorie;
	
	public List<PacienteEntities> listarTodos(){
		return pacienteRepositorie.findAll();
	}
	
	public void inserir(PacienteEntities paciente) {
		pacienteRepositorie.save(paciente);
	}
	public PacienteEntities alterar(PacienteEntities paciente) {
        if (paciente.getId() == null) {
            throw new IllegalArgumentException("ID do paciente não pode ser nulo para alteração.");
        }

        PacienteEntities pacienteExistente = pacienteRepositorie.findById(paciente.getId())
            .orElseThrow(() -> new RuntimeException("Paciente não encontrado com o id " + paciente.getId()));

        // Atualiza todos os campos do paciente existente com os novos valores
        pacienteExistente.setNome(paciente.getNome());
        pacienteExistente.setCpf(paciente.getCpf());
        pacienteExistente.setDataNascimento(paciente.getDataNascimento());
        pacienteExistente.setProfissao(paciente.getProfissao());
        pacienteExistente.setAltura(paciente.getAltura());
        pacienteExistente.setPeso(paciente.getPeso());
        pacienteExistente.setSexo(paciente.getSexo());
        pacienteExistente.setTelefone(paciente.getTelefone());
        pacienteExistente.setLicenca(paciente.getLicenca());

        // Salva as alterações
        return pacienteRepositorie.save(pacienteExistente);
    }
	
	public void excluir(Long id) {
		pacienteRepositorie.deleteById(id);
    }
}
