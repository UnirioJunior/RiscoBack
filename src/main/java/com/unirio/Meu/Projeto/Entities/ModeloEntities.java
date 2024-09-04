package com.unirio.Meu.Projeto.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MODELO")
public class ModeloEntities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "id_licenca", nullable = false)
    private LicencaEntities licenca;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false, columnDefinition = "text")
	private String descricao;
	
	public ModeloEntities() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LicencaEntities getLicenca() {
		return licenca;
	}

	public void setLicenca(LicencaEntities licenca) {
		this.licenca = licenca;
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
	
	
}
