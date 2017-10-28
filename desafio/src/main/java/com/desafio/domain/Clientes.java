package com.desafio.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CLIENTES")
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "COD_CLIENTES")
	private Long codClientes;
	
	@JoinColumn(name = "COD_CLIENTE_INDIVIDUAL")
	private ClienteIndividual clienteIndividual;
	
	@JoinColumn(name = "COD_CLIENTE_CORPORATIVO")
	private ClienteCorporativo clienteCorporaivo;
	
	@JoinColumn(name = "COD_ENDERECO")
	private Endereco endereco;
	
	@Max(value = 250)
	@NotNull
	@Column(name = "NOME")
	private String nome;
	
	@Max(value = 2)
	@NotNull
	@Column(name = "TIPO")
	private String tipo;
	
	@Max(value = 250)
	@Column(name = "EMAIL")
	private String email;
	
	@Max(value = 14)
	@Column(name = "TELEFONE")
	private String telefone;
	
	@NotNull
	@Column(name = "DT_CRIACAO")
	private LocalDate dataCriacao;
	
	@Column(name = "DT_MODIFICACAO")
	private LocalDate dataModificacao;

	public Long getCodClientes() {
		return codClientes;
	}

	public void setCodClientes(Long codClientes) {
		this.codClientes = codClientes;
	}

	public ClienteIndividual getClienteIndividual() {
		return clienteIndividual;
	}

	public void setClienteIndividual(ClienteIndividual clienteIndividual) {
		this.clienteIndividual = clienteIndividual;
	}

	public ClienteCorporativo getClienteCorporaivo() {
		return clienteCorporaivo;
	}

	public void setClienteCorporaivo(ClienteCorporativo clienteCorporaivo) {
		this.clienteCorporaivo = clienteCorporaivo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
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
