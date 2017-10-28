package com.domain.dto;

import javax.validation.constraints.Max;

public class ClienteCorporativoDTO {

	private Long codClienteCorporativo;

	@Max(value = 250)
	private String nomeCorporativo;

	@Max(value = 18)
	private String cnpj;

	@Max(value = 150)
	private String estadoRegistrado;

	@Max(value = 250)
	private String nomeContato;

	@Max(value = 15)
	private String telefone;

	@Max(value = 250)
	private String email;
	private Boolean isEmpresaPai;
	private GrupoOrganizacionalDTO grupoOrganizacional;

	public Long getCodClienteCorporativo() {
		return codClienteCorporativo;
	}

	public void setCodClienteCorporativo(Long codClienteCorporativo) {
		this.codClienteCorporativo = codClienteCorporativo;
	}

	public String getNomeCorporativo() {
		return nomeCorporativo;
	}

	public void setNomeCorporativo(String nomeCorporativo) {
		this.nomeCorporativo = nomeCorporativo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEstadoRegistrado() {
		return estadoRegistrado;
	}

	public void setEstadoRegistrado(String estadoRegistrado) {
		this.estadoRegistrado = estadoRegistrado;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsEmpresaPai() {
		return isEmpresaPai;
	}

	public void setIsEmpresaPai(Boolean isEmpresaPai) {
		this.isEmpresaPai = isEmpresaPai;
	}

	public GrupoOrganizacionalDTO getGrupoOrganizacional() {
		return grupoOrganizacional;
	}

	public void setGrupoOrganizacional(GrupoOrganizacionalDTO grupoOrganizacional) {
		this.grupoOrganizacional = grupoOrganizacional;
	}

}
