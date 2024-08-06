package com.unirio.Meu.Projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unirio.Meu.Projeto.Entities.ProcedimentoEntities;
import com.unirio.Meu.Projeto.Repositories.ProcedimentoRepositories;

@Service
public class ProcedimentoService {
	
	@Autowired
	private ProcedimentoRepositories procedimentoRespositorie;
	
	public List<ProcedimentoEntities> listarTodos(){
		return procedimentoRespositorie.findAll();
	}
	
	public void inserir(ProcedimentoEntities procedimento) {
		procedimentoRespositorie.save(procedimento);
	}
	
	public void excluir(Long id) {
		procedimentoRespositorie.deleteById(id);
    }
}
