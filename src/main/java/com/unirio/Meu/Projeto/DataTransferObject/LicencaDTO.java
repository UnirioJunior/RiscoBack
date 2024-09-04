package com.unirio.Meu.Projeto.DataTransferObject;

import org.springframework.beans.BeanUtils;

import com.unirio.Meu.Projeto.Entities.LicencaEntities;

public class LicencaDTO {
	
	private Long id;
	private String nome;
	private String cnpj;
	private String endereco;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	private String dataAtivacao;
	private String dataInativa;
	private String observacao;
	private Boolean ativo;
	
	public LicencaDTO() {
		
	}
	
	public LicencaDTO(LicencaEntities licenca) {
		BeanUtils.copyProperties(licenca, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getDataAtivacao() {
		return dataAtivacao;
	}

	public void setDataAtivacao(String dataAtivacao) {
		this.dataAtivacao = dataAtivacao;
	}

	public String getDataInativa() {
		return dataInativa;
	}

	public void setDataInativa(String dataInativa) {
		this.dataInativa = dataInativa;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	
}
