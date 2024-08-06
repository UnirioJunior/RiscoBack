package com.unirio.Meu.Projeto.Entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "procedimento")
public class ProcedimentoEntities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "codigo_tuss", length = 10, nullable = true)
	private String codigoTuss;

	@Column(length = 255, nullable = true)
	private String descricao;

	@Column(length = 2, nullable = true)
	private String porte;

	@Column(name = "porte_anestesico", nullable = true)
	private Integer porteAnestesico;

	@Column(length = 45, nullable = true)
	private String grupo;

	@Column(length = 45, nullable = true)
	private String subgrupo;

	@Column(nullable = true, columnDefinition = "TINYINT(4)")
	private Boolean cirurgia;
	
	public ProcedimentoEntities() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoTuss() {
		return codigoTuss;
	}

	public void setCodigoTuss(String codigoTuss) {
		this.codigoTuss = codigoTuss;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public Integer getPorteAnestesico() {
		return porteAnestesico;
	}

	public void setPorteAnestesico(Integer porteAnestesico) {
		this.porteAnestesico = porteAnestesico;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getSubgrupo() {
		return subgrupo;
	}

	public void setSubgrupo(String subgrupo) {
		this.subgrupo = subgrupo;
	}

	public Boolean getCirurgia() {
		return cirurgia;
	}

	public void setCirurgia(Boolean cirurgia) {
		this.cirurgia = cirurgia;
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
		ProcedimentoEntities other = (ProcedimentoEntities) obj;
		return Objects.equals(id, other.id);
	}
	
	
}	
