package com.unirio.Meu.Projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unirio.Meu.Projeto.Entities.PreditorRiscoEntitie;
import com.unirio.Meu.Projeto.Repositories.PreditorRiscoRepositories;

@Service
public class PreditorRiscoService {
	
	@Autowired
	private PreditorRiscoRepositories preditorRepositorie;
	
	public List<PreditorRiscoEntitie> listarTodos(){
		return preditorRepositorie.findAll();
	}
	
	public void inserir(PreditorRiscoEntitie preditor) {
		preditorRepositorie.save(preditor);
	}
	
	public void excluir(Long id) {
		preditorRepositorie.deleteById(id);
    }
}
