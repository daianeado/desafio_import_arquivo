package com.domain.dto;

import java.time.LocalDate;

import javax.validation.constraints.Max;

public class ClientesDTO {

	private Long codClientes;
	private ClienteIndividualDTO clienteIndividual;
	private ClienteCorporativoDTO clienteCorporaivo;
	private EnderecoDTO endereco;

	@Max(value = 250)
	private String nome;

	@Max(value = 2)
	private String tipo;

	@Max(value = 250)
	private String email;

	@Max(value = 14)
	private String telefone;

	private LocalDate dataCriacao;

	private LocalDate dataModificacao;

	public Long getCodClientes() {
		return codClientes;
	}

	public void setCodClientes(Long codClientes) {
		this.codClientes = codClientes;
	}

	public ClienteIndividualDTO getClienteIndividual() {
		return clienteIndividual;
	}

	public void setClienteIndividual(ClienteIndividualDTO clienteIndividual) {
		this.clienteIndividual = clienteIndividual;
	}

	public ClienteCorporativoDTO getClienteCorporaivo() {
		return clienteCorporaivo;
	}

	public void setClienteCorporaivo(ClienteCorporativoDTO clienteCorporaivo) {
		this.clienteCorporaivo = clienteCorporaivo;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDate getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(LocalDate dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

}
