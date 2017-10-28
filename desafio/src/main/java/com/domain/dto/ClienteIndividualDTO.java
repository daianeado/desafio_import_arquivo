package com.domain.dto;

import java.time.LocalDate;

import javax.validation.constraints.Max;

public class ClienteIndividualDTO {

	private Long codClienteIndividual;

	@Max(value = 14)
	private String cpf;

	private LocalDate dataAniversario;

	@Max(value = 15)
	private String telefone;

	public Long getCodClienteIndividual() {
		return codClienteIndividual;
	}

	public void setCodClienteIndividual(Long codClienteIndividual) {
		this.codClienteIndividual = codClienteIndividual;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(LocalDate dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
