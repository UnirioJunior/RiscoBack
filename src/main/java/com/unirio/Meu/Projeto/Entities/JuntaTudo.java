package com.unirio.Meu.Projeto.Entities;

import java.util.List;

public class JuntaTudo {
    private FormRiscoCirurgicoEntities form;
    private List<FormRiscoCirurgicoClassificacaoEntities> listaClassificacao;
    private List<FormRiscoCirurgicoPreditoresEntities> listaPreditores;
    private ExamesLaboratoriaisEntities exames;

    public JuntaTudo() {
    	
    }

    public FormRiscoCirurgicoEntities getForm() {
        return form;
    }

    public void setForm(FormRiscoCirurgicoEntities form) {
        this.form = form;
    }

    public List<FormRiscoCirurgicoClassificacaoEntities> getListaClassificacao() {
        return listaClassificacao;
    }

    public void setListaClassificacao(List<FormRiscoCirurgicoClassificacaoEntities> listaClassificacao) {
        this.listaClassificacao = listaClassificacao;
    }

    public List<FormRiscoCirurgicoPreditoresEntities> getListaPreditores() {
        return listaPreditores;
    }

    public void setListaPreditores(List<FormRiscoCirurgicoPreditoresEntities> listaPreditores) {
        this.listaPreditores = listaPreditores;
    }

	public ExamesLaboratoriaisEntities getExames() {
		return exames;
	}

	public void setExames(ExamesLaboratoriaisEntities exames) {
		this.exames = exames;
	}
	@Override
    public String toString() {
        return "JuntaTudo{" +
                "exames=" + exames +
                '}';
    }

}

