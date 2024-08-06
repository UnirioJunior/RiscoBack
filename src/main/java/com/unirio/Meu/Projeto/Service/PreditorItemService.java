package com.unirio.Meu.Projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unirio.Meu.Projeto.Entities.PreditorItemEntities;
import com.unirio.Meu.Projeto.Repositories.PreditorItemRepositories;

@Service
public class PreditorItemService {
	
	@Autowired
	private PreditorItemRepositories preditorItem;
	
	public List<PreditorItemEntities> listarTodos(){
		return preditorItem.findAll();
	}
	
	public void inserir(PreditorItemEntities javo) {
		preditorItem.save(javo);
	}
	
	public void excluir(Long id) {
		preditorItem.deleteById(id);
    }
}
