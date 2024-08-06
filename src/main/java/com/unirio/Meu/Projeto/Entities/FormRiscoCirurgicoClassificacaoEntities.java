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
@Table(name = "form_risco_cirurgico_classificacao")
public class FormRiscoCirurgicoClassificacaoEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_form", nullable = false)
    private FormRiscoCirurgicoEntities idForm;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private int ponto;
	
	public FormRiscoCirurgicoClassificacaoEntities() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FormRiscoCirurgicoEntities getIdForm() {
		return idForm;
	}

	public void setIdForm(FormRiscoCirurgicoEntities idForm) {
		this.idForm = idForm;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPonto() {
		return ponto;
	}

	public void setPonto(int ponto) {
		this.ponto = ponto;
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
		FormRiscoCirurgicoClassificacaoEntities other = (FormRiscoCirurgicoClassificacaoEntities) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
