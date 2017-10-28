package com.domain.dto;

import javax.validation.constraints.Max;

public class EstadoDTO {

	private Long codEstado;

	@Max(value = 3)
	private String acronimo;

	@Max(value = 250)
	private String nome;

	public Long getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(Long codEstado) {
		this.codEstado = codEstado;
	}

	public String getAcronimo() {
		return acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
