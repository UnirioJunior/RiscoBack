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
@Table(name = "form_risco_cirurgico_examesLaboratoriais")
public class FormRiscoCirurgicoExamesLaboratorialEntities {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_form", nullable = false)
	private FormRiscoCirurgicoEntities idForm;
	
	@ManyToOne
	@JoinColumn(name = "id_exames", nullable = true)
	private ExamesLaboratoriaisEntities exames;

    public FormRiscoCirurgicoExamesLaboratorialEntities() {
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
    
    

    public ExamesLaboratoriaisEntities getExames() {
		return exames;
	}


	public void setExames(ExamesLaboratoriaisEntities exames) {
		System.out.println("Chamei o SET EXAMES: " + exames);
		this.exames = exames;
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
        FormRiscoCirurgicoExamesLaboratorialEntities other = (FormRiscoCirurgicoExamesLaboratorialEntities) obj;
        return Objects.equals(id, other.id);
    }
}
