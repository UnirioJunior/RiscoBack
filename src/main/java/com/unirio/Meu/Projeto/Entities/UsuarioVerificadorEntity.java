package com.unirio.Meu.Projeto.Entities;


import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO_VERIFICADOR")
public class UsuarioVerificadorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private UUID uuid;
	
	@Column(nullable = false)
	private Instant dataExpiracao;
	
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID", unique = true)
	private UserEntities usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public Instant getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(Instant dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	public UserEntities getUsuario() {
		return usuario;
	}

	public void setUsuario(UserEntities usuario) {
		this.usuario = usuario;
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
		UsuarioVerificadorEntity other = (UsuarioVerificadorEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}