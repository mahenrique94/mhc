package br.com.mhc.cpf;

public interface Validator {

	default int calculateDigit(String[] numbers) {
		int total = 0;
		int index = numbers.length;
		for (int i = 0; i < (numbers.length - 1); i++) {
			total += Integer.parseInt(numbers[i]) * index;
			index--;
		}
		return (total * 10) % 11;
	}
	
	default boolean isValid(int digitCalculated, int digit) {
		return digitCalculated == digit;
	}
	
}
