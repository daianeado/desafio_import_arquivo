package com.domain.dto;

import javax.validation.constraints.Max;

public class CidadeDTO {
	
	private Long codCidade;
	private EstadoDTO estado;
	
	@Max(value = 250)
	private String nome;
	
	public Long getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(Long codCidade) {
		this.codCidade = codCidade;
	}

	public EstadoDTO getEstado() {
		return estado;
	}

	public void setEstado(EstadoDTO estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
