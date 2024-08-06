package com.unirio.Meu.Projeto.Entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "form_risco_cirurgico_preditores")
public class FormRiscoCirurgicoPreditoresEntities {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_form", nullable = false)
	private FormRiscoCirurgicoEntities idForm;
	
	@ManyToOne
	@JoinColumn(name = "id_preditores", nullable = false)
	private PreditorRiscoEntitie idPreditor;
	
	public FormRiscoCirurgicoPreditoresEntities() {
		
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

	public PreditorRiscoEntitie getIdPreditor() {
		return idPreditor;
	}

	public void setIdPreditor(PreditorRiscoEntitie idPreditor) {
		this.idPreditor = idPreditor;
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
		FormRiscoCirurgicoPreditoresEntities other = (FormRiscoCirurgicoPreditoresEntities) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
