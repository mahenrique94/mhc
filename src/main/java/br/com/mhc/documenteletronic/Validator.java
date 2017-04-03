package br.com.mhc.documenteletronic;

import br.com.mhc.function.StringFunction;

public interface Validator {

	default boolean isValid(String chave, int digit) {
		String chaveToValidate = StringFunction.reverse(chave.substring(0, 43));
		int soma = 0, multiple = 2, result = 0;
		for (int i = 0; i < chaveToValidate.length(); i++) {
			if (multiple > 9) 
				multiple = 2;
			soma += multiple * Character.getNumericValue(chaveToValidate.charAt(i));
			multiple++;
		}
		result = soma % 11 <= 1 ? 11 : soma % 11;
		result = 11 - result;
		return result == digit;
	}
	
}
