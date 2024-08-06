package com.unirio.Meu.Projeto.DataTransferObject;



import org.springframework.beans.BeanUtils;

import com.unirio.Meu.Projeto.Entities.PermissaoPerfilRecursoEntities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PermissaoPerfilRecursoDTO {
	
	private Long id;
	private PerfilDTO perfil;	
	private RecursoDTO recurso;
	
	public PermissaoPerfilRecursoDTO(PermissaoPerfilRecursoEntities permissaoPerfilRecurso) {
		BeanUtils.copyProperties(permissaoPerfilRecurso, this);
		if(permissaoPerfilRecurso != null && permissaoPerfilRecurso.getRecurso() != null) {
			this.recurso = new RecursoDTO(permissaoPerfilRecurso.getRecurso());
		}
		if(permissaoPerfilRecurso != null && permissaoPerfilRecurso.getPerfil() != null) {
			this.perfil = new PerfilDTO(permissaoPerfilRecurso.getPerfil());
		}		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PerfilDTO getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilDTO perfil) {
		this.perfil = perfil;
	}

	public RecursoDTO getRecurso() {
		return recurso;
	}

	public void setRecurso(RecursoDTO recurso) {
		this.recurso = recurso;
	}
	
	
}
