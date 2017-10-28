package com.desafio.service.impl;

import com.desafio.service.CPFCNPJService;

public class CPFCNPJServiceImpl implements CPFCNPJService {

	/**
	 * Método para validar CPF informado
	 */
	@Override
	public Boolean validaCPF(String CPF) {

		// Um CPF é considerado inválido quando todos seus digitos são iguais
		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999") || (CPF.length() != 11)) {

			return false;
		}

		return null;
	}

	/**
	 * Método para remover caracteres inválidos
	 */
	private void removerCaracteres(String CPF) {
		CPF = CPF.replace("-", "");
		CPF = CPF.replace(".", "");
	}
	
	/**
	 * Método para validar tamanho do CPF informado
	 */
	private boolean verificarTamanhoCPFInvalido(String cpf){   
	      if ( cpf.length() != 11 )
	          return true;    
	          return false;
	  }
	 
}
