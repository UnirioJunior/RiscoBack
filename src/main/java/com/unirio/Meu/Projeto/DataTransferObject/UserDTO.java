package com.unirio.Meu.Projeto.DataTransferObject;

import org.springframework.beans.BeanUtils;

import com.unirio.Meu.Projeto.Entities.UserEntities;
import com.unirio.Meu.Projeto.Entities.enums.TipoSituacaoUsuario;


public class UserDTO {
	
	private Long id;
	private LicencaDTO licenca;
	private String nome;
	private String login;
	private String email;
	private String senha;
	private String crm;
	private String especialidade;
	private TipoSituacaoUsuario situacao;
	
	public UserDTO(UserEntities user) {
	    BeanUtils.copyProperties(user, this);
	    if (user.getLicenca() != null) {
	        this.licenca = new LicencaDTO(user.getLicenca());
	    }
	}

	
	public UserDTO() {
		
	}
	
	public LicencaDTO getLicenca() {
		return licenca;
	}

	public void setLicenca(LicencaDTO licenca) {
		this.licenca = licenca;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public TipoSituacaoUsuario getSituacao() {
		return situacao;
	}

	public void setSituacao(TipoSituacaoUsuario situacao) {
		this.situacao = situacao;
	}


	public String getCrm() {
		return crm;
	}


	public void setCrm(String crm) {
		this.crm = crm;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
