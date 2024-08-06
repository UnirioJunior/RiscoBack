package com.unirio.Meu.Projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unirio.Meu.Projeto.Entities.ProcedimentoRiscoEntities;
import com.unirio.Meu.Projeto.Repositories.ProcedimentoRiscoRepositories;

@Service
public class ProcedimentoRiscoService {
	
	@Autowired
	private ProcedimentoRiscoRepositories procedimentoRiscoRespositorie;
	
	public List<ProcedimentoRiscoEntities> listarTodos(){
		return procedimentoRiscoRespositorie.findAll();
	}
	
	public void inserir(ProcedimentoRiscoEntities risco) {
		procedimentoRiscoRespositorie.save(risco);
	}
	
	public void excluir(Long id) {
		procedimentoRiscoRespositorie.deleteById(id);
    }
}
