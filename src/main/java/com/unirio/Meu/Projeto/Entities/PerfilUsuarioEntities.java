package com.unirio.Meu.Projeto.Entities;

import org.springframework.beans.BeanUtils;

import com.unirio.Meu.Projeto.DataTransferObject.PerfilUsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "perfil_usuario")
public class PerfilUsuarioEntities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private UserEntities usuario;
	
	@ManyToOne
	@JoinColumn(name="perfil_id")
	private PerfilEntities perfil;
	
	public PerfilUsuarioEntities(PerfilUsuarioDTO perfilUsuario) {
		BeanUtils.copyProperties(perfilUsuario, this);
		if (perfilUsuario != null && perfilUsuario.getUsuario() != null) {
			this.usuario = new UserEntities(perfilUsuario.getUsuario());
		}
		if(perfilUsuario != null && perfilUsuario.getUsuario() != null) {
			this.perfil = new PerfilEntities(perfilUsuario.getPerfil());
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserEntities getUsuario() {
		return usuario;
	}

	public void setUsuario(UserEntities usuario) {
		this.usuario = usuario;
	}

	public PerfilEntities getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilEntities perfil) {
		this.perfil = perfil;
	}	
	
	

}
