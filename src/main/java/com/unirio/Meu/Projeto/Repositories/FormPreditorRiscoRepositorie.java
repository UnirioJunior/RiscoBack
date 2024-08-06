package com.unirio.Meu.Projeto.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unirio.Meu.Projeto.Entities.FormRiscoCirurgicoEntities;
import com.unirio.Meu.Projeto.Entities.FormRiscoCirurgicoPreditoresEntities;

public interface FormPreditorRiscoRepositorie extends JpaRepository<FormRiscoCirurgicoPreditoresEntities, Long>{
	List<FormRiscoCirurgicoPreditoresEntities> findByIdForm(FormRiscoCirurgicoEntities idForm);
}
