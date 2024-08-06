package com.unirio.Meu.Projeto.Entities;

import org.springframework.beans.BeanUtils;

import com.unirio.Meu.Projeto.DataTransferObject.PerfilDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "perfil")
public class PerfilEntities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, name = "perfil_name")
	private String descricao;
	
	public PerfilEntities(PerfilDTO perfil){
		BeanUtils.copyProperties(perfil, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
