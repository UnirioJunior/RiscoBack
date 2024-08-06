package com.unirio.Meu.Projeto.Entities;
import org.springframework.beans.BeanUtils;

import com.unirio.Meu.Projeto.DataTransferObject.PermissaoPerfilRecursoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERMISSAO_PERFIL_RECURSO")
public class PermissaoPerfilRecursoEntities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "ID_PERFIL")
	private PerfilEntities perfil;
	
	@ManyToOne
	@JoinColumn(name = "ID_RECURSO")
	private RecursoEntities recurso;
	
	public PermissaoPerfilRecursoEntities(PermissaoPerfilRecursoDTO permissaoPerfilRecurso) {
		BeanUtils.copyProperties(permissaoPerfilRecurso, this);
		if(permissaoPerfilRecurso != null && permissaoPerfilRecurso.getRecurso() != null) {
			this.recurso = new RecursoEntities(permissaoPerfilRecurso.getRecurso());
		}
		if(permissaoPerfilRecurso != null && permissaoPerfilRecurso.getPerfil() != null) {
			this.perfil = new PerfilEntities(permissaoPerfilRecurso.getPerfil());
		}	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PerfilEntities getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilEntities perfil) {
		this.perfil = perfil;
	}

	public RecursoEntities getRecurso() {
		return recurso;
	}

	public void setRecurso(RecursoEntities recurso) {
		this.recurso = recurso;
	}
	
	
}