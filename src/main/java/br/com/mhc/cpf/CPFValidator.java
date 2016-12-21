package br.com.mhc.cpf;

public class CPFValidator {

	public boolean isValid(CPF cpf) {
		int firstDigit = calculateDigit(cpf.getNumbersToFirstDigit());
		int secondDigit = calculateDigit(cpf.getNumbersToSecondDigit());
		
		return (firstDigit == cpf.getFirstDigit()) && (secondDigit == cpf.getSecondDigit());
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
	
}
