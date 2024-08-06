package com.unirio.Meu.Projeto.Entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "preditores")
public class PreditorRiscoEntitie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	@Column(length = 45, nullable = true)
	private String descricao;
	
	public PreditorRiscoEntitie() {
		
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
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PreditorRiscoEntitie other = (PreditorRiscoEntitie) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
