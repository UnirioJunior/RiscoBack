package com.unirio.Meu.Projeto.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unirio.Meu.Projeto.Entities.FormRiscoCirurgicoClassificacaoEntities;
import com.unirio.Meu.Projeto.Entities.FormRiscoCirurgicoEntities;

public interface FormClassificacaoRiscoRepositorie extends JpaRepository<FormRiscoCirurgicoClassificacaoEntities, Long>{
	List<FormRiscoCirurgicoClassificacaoEntities> findByIdForm(FormRiscoCirurgicoEntities idForm);
}
