package br.com.mhc.cpf;

import br.com.mhc.function.StringFunction;

public class CPFValidator {
	
	public static final String REGEX_REPEAT = "([0]{11})|([1]{11})|([2]{11})|([3]{11})|([4]{11})|([5]{11})|([6]{11})|([7]{11})|([8]{11})|([9]{11})";

	public boolean isValid(CPF cpf) {
		int firstDigit = calculateDigit(cpf.getNumbersToFirstDigit());
		int secondDigit = calculateDigit(cpf.getNumbersToSecondDigit());
		
		return (firstDigit == cpf.getFirstDigit()) && (secondDigit == cpf.getSecondDigit()) && !repeatNumbers(cpf.unformat());
	}
	
	private int calculateDigit(String[] numbers) {
		int total = 0;
		int index = numbers.length;
		for (int i = 0; i < (numbers.length - 1); i++) {
			total += Integer.parseInt(numbers[i]) * index;
			index--;
		}
		return (total * 10) % 11;
	}
	
	private boolean repeatNumbers(String cpf) {
		return StringFunction.isMatcher(REGEX_REPEAT, cpf);
	}
	
}
