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
@Table(name = "CLIENTE_CORPORATIVO")
public class ClienteCorporativo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "COD_CLIENTE_CORPORATIVO")
	private long codClienteCorporativo;
	
	@Max(value = 250)
	@NotNull
	@Column(name = "NOME_CORPORATIVO")
	private String nomeCorporativo;
	
	@Max(value = 18)
	@NotNull
	@Column(name = "CNPJ")
	private String cnpj;
	
	@Max(value = 150)
	@Column(name = "ESTADO_REGISTRADO")
	private String estadoRegistrado;
	
	@Max(value = 250)
	@Column(name = "NOME_CONTATO")
	private String nomeContato;
	
	@Max(value = 15)
	@Column(name = "TELEFONE")
	private String telefone;
	
	@Max(value = 250)
	@Column(name = "EMAIL")
	private String email;
	
	@NotNull
	@Column(name = "IS_EMPRESA_PAI")
	private Boolean isEmpresaPai;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "COD_GRUPO_ORGANIZACIONAL")
	private GrupoOrganizacional grupoOrganizacional;
	
	
	
}
