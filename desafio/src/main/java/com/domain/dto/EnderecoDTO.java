package com.domain.dto;

import javax.validation.constraints.Max;

public class EnderecoDTO {

	private long codEndereco;
	private CidadeDTO cidade;

	@Max(value = 250)
	private String rua;

	@Max(value = 10)
	private String cep;

	@Max(value = 10)
	private String numero;

	@Max(value = 250)
	private String distrito;

	@Max(value = 100)
	private String complemento;

	public long getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(long codEndereco) {
		this.codEndereco = codEndereco;
	}

	public CidadeDTO getCidade() {
		return cidade;
	}

	public void setCidade(CidadeDTO cidade) {
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
