package com.unirio.Meu.Projeto.Entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "risco")
public class ProcedimentoRiscoEntities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	@Column(length = 45, nullable = true)
	private String nome;
	@Column(length = 255, nullable = true)
	private String descricao;
	
	public ProcedimentoRiscoEntities() {
		
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
		ProcedimentoRiscoEntities other = (ProcedimentoRiscoEntities) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
