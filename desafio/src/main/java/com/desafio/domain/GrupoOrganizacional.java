package com.desafio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "GRUPO_ORGANIZACIONAL")
public class GrupoOrganizacional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "COD_GRUPO_ORGANIZACIONAL")
	private Long codGrupoOrganizacional;
	
	@Max(value = 250)
	@NotNull
	@Column(name = "NOME")
	private String nome;
	
	@Max(value = 36)
	@Column(name = "EMPRESA_PAI")
	private String empresaPai;

	public Long getCodGrupoOrganizacional() {
		return codGrupoOrganizacional;
	}

	public void setCodGrupoOrganizacional(Long codGrupoOrganizacional) {
		this.codGrupoOrganizacional = codGrupoOrganizacional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmpresaPai() {
		return empresaPai;
	}

	public void setEmpresaPai(String empresaPai) {
		this.empresaPai = empresaPai;
	}
}
