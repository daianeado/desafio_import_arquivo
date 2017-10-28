package com.desafio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ENDERECO")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "COD_ENDERECO")
	private long codEndereco;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name ="COD_CIDADE")
	private Cidade cidade;
	
	@Max(value = 250)
	@NotNull
	@Column(name = "RUA")
	private String rua;
	
	@Max(value = 10)
	@NotNull
	@Column(name = "CEP")
	private String cep;
	
	@Max(value = 10)
	@NotNull
	@Column(name = "NUMERO")
	private String numero;
	
	@Max(value = 250)
	@NotNull
	@Column(name = "DISTRITO")
	private String distrito;
	
	@Max(value = 100)
	@Column(name = "COMPLEMENTO")
	private String complemento;

	public long getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(long codEndereco) {
		this.codEndereco = codEndereco;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
