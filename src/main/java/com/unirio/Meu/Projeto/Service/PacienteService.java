package com.unirio.Meu.Projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unirio.Meu.Projeto.Entities.PacienteEntities;
import com.unirio.Meu.Projeto.Repositories.PacienteRepositories;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepositories pacienteRepositorie;
	
	public List<PacienteEntities> listarTodos(){
		return pacienteRepositorie.findAll();
	}
	
	public void inserir(PacienteEntities paciente) {
		pacienteRepositorie.save(paciente);
	}
	
	public void excluir(Long id) {
		pacienteRepositorie.deleteById(id);
    }
}
