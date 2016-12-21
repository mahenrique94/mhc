package br.com.mhc.cpf;

public abstract class CPFValidator {

	private static final Digit DIGIT = new Digit();

	public static boolean isValid(CPF cpf) {
		int firstDigit = DIGIT.calculateDigit(cpf.getNumbersToFirstDigit());
		if (!DIGIT.isValid(firstDigit, cpf.getFirstDigit()))
			return false;
		
		int secondDigit = DIGIT.calculateDigit(cpf.getNumbersToSecondDigit());
		if (!DIGIT.isValid(secondDigit, cpf.getSecondDigit()))
			return false;
		
		return true;
	}
	
}
