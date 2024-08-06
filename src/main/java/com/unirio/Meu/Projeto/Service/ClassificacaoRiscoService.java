package com.unirio.Meu.Projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unirio.Meu.Projeto.Entities.ClassificacaoRiscoEntities;
import com.unirio.Meu.Projeto.Repositories.ClassificacaoRiscoRepositories;

@Service
public class ClassificacaoRiscoService {
	
	@Autowired
	private ClassificacaoRiscoRepositories classificacaoRepositorie;
	
	public List<ClassificacaoRiscoEntities> listarTodos(){
		return classificacaoRepositorie.findAll();
	}
	
	public void inserir(ClassificacaoRiscoEntities classificacao) {
		classificacaoRepositorie.save(classificacao);
	}
	
	public void excluir(Long id) {
		classificacaoRepositorie.deleteById(id);
    }
}
