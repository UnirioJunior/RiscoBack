package com.unirio.Meu.Projeto.Entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "preditores_item")
public class PreditorItemEntities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_preditor", nullable = false)
	private PreditorRiscoEntitie idPreditor;
	
	@Column(length = 45, nullable = true)
	private String descricao;
	
	public PreditorItemEntities() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PreditorRiscoEntitie getIdPreditor() {
		return idPreditor;
	}

	public void setIdPreditor(PreditorRiscoEntitie idPreditor) {
		this.idPreditor = idPreditor;
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
		PreditorItemEntities other = (PreditorItemEntities) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
