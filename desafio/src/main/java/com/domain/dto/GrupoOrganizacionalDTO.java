package com.domain.dto;

import javax.validation.constraints.Max;

public class GrupoOrganizacionalDTO {

	private Long codGrupoOrganizacional;

	@Max(value = 250)
	private String nome;

	@Max(value = 36)
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
