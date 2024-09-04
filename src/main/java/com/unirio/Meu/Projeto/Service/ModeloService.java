package com.unirio.Meu.Projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unirio.Meu.Projeto.Entities.ModeloEntities;
import com.unirio.Meu.Projeto.Repositories.ModeloRepositories;

@Service
public class ModeloService {
	
	@Autowired
	private ModeloRepositories modeloRepositorio;
	
	public List<ModeloEntities> listarTodos(){
		return modeloRepositorio.findAll();	
	}
	
	public void inserir(ModeloEntities java) {
		modeloRepositorio.save(java);
	}
	
	public void excluir(long id) {
		modeloRepositorio.deleteById(id);
	}
}
