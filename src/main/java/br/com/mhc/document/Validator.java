package br.com.mhc.document;

import br.com.mhc.function.StringFunction;

public interface Validator {

	int calculateDigit(String[] numbers);
	
	default boolean isValid(Document document) {
		int firstDigit = calculateDigit(document.getNumbersToFirstDigit());
		int secondDigit = calculateDigit(document.getNumbersToSecondDigit());
		
		return (firstDigit == document.getFirstDigit()) && (secondDigit == document.getSecondDigit()) && !repeatNumbers(document.unformat());
	}
	
	default boolean repeatNumbers(String document) {
		return StringFunction.isMatcher(Pattern.CPF.getRepeat(), document) || StringFunction.isMatcher(Pattern.CNPJ.getRepeat(), document);
	}
	
}
