package com.desafio.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CLIENTE_INDIVIDUAL")
public class ClienteIndividual {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "COD_CLIENTE_INDIVIDUAL")
	private Long codClienteIndividual;
	
	@NotNull
	@Max(value = 14)
	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "DT_ANIVERSARIO")
	private LocalDate dataAniversario;
	
	@Max(value = 15)
	@Column(name = "TELEFONE")
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
