package com.unirio.Meu.Projeto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unirio.Meu.Projeto.Entities.FormRiscoCirurgicoEntities;
import com.unirio.Meu.Projeto.Entities.FormRiscoCirurgicoExamesLaboratorialEntities;

public interface FormExamesLaboratoriaisRepositories extends JpaRepository<FormRiscoCirurgicoExamesLaboratorialEntities, Long>{
	FormRiscoCirurgicoExamesLaboratorialEntities findByIdForm(FormRiscoCirurgicoEntities idForm);
}
