package com.unirio.Meu.Projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unirio.Meu.Projeto.Entities.ExamesLaboratoriaisEntities;
import com.unirio.Meu.Projeto.Repositories.ExamesLaboratoriaisRepositories;

@Service
public class ExamesLaboratoriaisService {
	
	@Autowired
	private ExamesLaboratoriaisRepositories examesRepositorie;
	
	public List<ExamesLaboratoriaisEntities> listarTodos(){
		return examesRepositorie.findAll();
	}
	
	public void inserir(ExamesLaboratoriaisEntities javo) {
		examesRepositorie.save(javo);
	}
	
	public void excluir(Long id) {
		examesRepositorie.deleteById(id);
    }
}
