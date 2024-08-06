package com.unirio.Meu.Projeto.Entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "licenca")
public class LicencaEntities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 255, nullable = true)
	private String nome;
	@Column(length = 14, nullable = true)
	private String cnpj;
	@Column(length = 255, nullable = true)
	private String endereco;
	@Column(length = 255, nullable = true)
	private String bairro;
	@Column(length = 8, nullable = true)
	private String cep;
	@Column(length = 45, nullable = true)
	private String cidade;
	@Column(length = 45, nullable = true)
	private String uf;
	@Column(name = "data_ativacao", nullable = true)
	private String dataAtivacao;
	@Column(name = "data_inativa", nullable = true)
	private String dataInativa;
	@Column(length = 600, nullable = true)
	private String observacao;
	@Column(nullable = true, columnDefinition = "TINYINT(4)")
	private Boolean ativo;
	
	public LicencaEntities() {
		
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
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LicencaEntities other = (LicencaEntities) obj;
		return Objects.equals(id, other.id);
	}
	
}
