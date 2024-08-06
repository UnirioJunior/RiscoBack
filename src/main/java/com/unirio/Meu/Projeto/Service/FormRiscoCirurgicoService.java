package com.unirio.Meu.Projeto.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.unirio.Meu.Projeto.Entities.ExamesLaboratoriaisEntities;
import com.unirio.Meu.Projeto.Entities.FormRiscoCirurgicoClassificacaoEntities;
import com.unirio.Meu.Projeto.Entities.FormRiscoCirurgicoEntities;
import com.unirio.Meu.Projeto.Entities.FormRiscoCirurgicoExamesLaboratorialEntities;
import com.unirio.Meu.Projeto.Entities.FormRiscoCirurgicoPreditoresEntities;
import com.unirio.Meu.Projeto.Entities.JuntaTudo;
import com.unirio.Meu.Projeto.Entities.PreditorRiscoEntitie;
import com.unirio.Meu.Projeto.Repositories.ExamesLaboratoriaisRepositories;
import com.unirio.Meu.Projeto.Repositories.FormClassificacaoRiscoRepositorie;
import com.unirio.Meu.Projeto.Repositories.FormExamesLaboratoriaisRepositories;
import com.unirio.Meu.Projeto.Repositories.FormPreditorRiscoRepositorie;
import com.unirio.Meu.Projeto.Repositories.FormRiscoCirurgicoRepositories;
import com.unirio.Meu.Projeto.Repositories.PreditorRiscoRepositories;

import jakarta.transaction.Transactional;
@Service
public class FormRiscoCirurgicoService {
	
	@Autowired
	private FormRiscoCirurgicoRepositories formRepositorie;
	@Autowired
	private FormClassificacaoRiscoRepositorie classificacaoRepositorie;
	@Autowired
	private FormPreditorRiscoRepositorie preditorRepositorie;
	@Autowired
    private PreditorRiscoRepositories preditorRiscoRepositorie;
	@Autowired
    private FormExamesLaboratoriaisRepositories formRiscoCirurgicoExamesLaboratorialRepositorie;
	@Autowired
	private ExamesLaboratoriaisRepositories examesRepository;
	
	
	
	public List<FormRiscoCirurgicoEntities> listarTodos(){
		return formRepositorie.findAll();
	}
	
	@Transactional
	public void inserir(JuntaTudo tudo) {
	    
	    FormRiscoCirurgicoEntities formulario = tudo.getForm();
	    formRepositorie.save(formulario);

	    
	    for (FormRiscoCirurgicoClassificacaoEntities classificacao : tudo.getListaClassificacao()) {
	        classificacao.setIdForm(formulario);
	        classificacaoRepositorie.save(classificacao);
	    }

	    
	    for (FormRiscoCirurgicoPreditoresEntities preditorData : tudo.getListaPreditores()) {
	        FormRiscoCirurgicoPreditoresEntities preditor = new FormRiscoCirurgicoPreditoresEntities();
	        preditor.setIdForm(formulario);

	        PreditorRiscoEntitie preditorRisco = preditorRiscoRepositorie.findById(preditorData.getId())
	                .orElseThrow(() -> new RuntimeException("Preditor não encontrado"));
	        preditor.setIdPreditor(preditorRisco);

	        preditorRepositorie.save(preditor);
	    }

	    ExamesLaboratoriaisEntities exames = tudo.getExames();
	    examesRepository.save(exames); 

	    FormRiscoCirurgicoExamesLaboratorialEntities examesEntity = new FormRiscoCirurgicoExamesLaboratorialEntities();
	    examesEntity.setIdForm(formulario);
	    examesEntity.setExames(exames);

	    formRiscoCirurgicoExamesLaboratorialRepositorie.save(examesEntity); 

	    
	}

	
	public void excluir(Long id) {
		formRepositorie.deleteById(id);
    }
	
	
    public JuntaTudo buscarId(Long id) {
        FormRiscoCirurgicoEntities formulario = formRepositorie.findById(id)
                .orElseThrow(() -> new RuntimeException("Formulário não encontrado"));

        List<FormRiscoCirurgicoClassificacaoEntities> listaClassificacao = classificacaoRepositorie.findByIdForm(formulario);
        List<FormRiscoCirurgicoPreditoresEntities> listaPreditores = preditorRepositorie.findByIdForm(formulario);
        
        FormRiscoCirurgicoExamesLaboratorialEntities examesEntity = formRiscoCirurgicoExamesLaboratorialRepositorie.findByIdForm(formulario);
        ExamesLaboratoriaisEntities exames = examesEntity.getExames();
        
        JuntaTudo tudo = new JuntaTudo();
        tudo.setForm(formulario);
        tudo.setListaClassificacao(listaClassificacao);
        tudo.setListaPreditores(listaPreditores);
        tudo.setExames(exames);
        
        return tudo;
    }
}

