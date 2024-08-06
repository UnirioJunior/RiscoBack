package com.unirio.Meu.Projeto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unirio.Meu.Projeto.Entities.LicencaEntities;
import com.unirio.Meu.Projeto.Repositories.LicencaRepositories;


@Service
public class LicencaService {
	
	@Autowired
	private LicencaRepositories licencaRespositorie;
	
	public List<LicencaEntities> listarTodos(){
		return licencaRespositorie.findAll();
	}
	
	public void inserir(LicencaEntities licenca) {
		licencaRespositorie.save(licenca);
		
	}
	
	public void excluir(Long id) {
		licencaRespositorie.deleteById(id);
    }
}
