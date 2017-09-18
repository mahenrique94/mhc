package br.com.mhc.document;

public class CPFValidator implements Validator {

	@Override
	public int calculateDigit(String[] numbers) {
		// TODO Auto-generated method stub
		int total = 0;
		int index = numbers.length;
		for (int i = 0; i < (numbers.length - 1); i++) {
			total += Integer.parseInt(numbers[i]) * index;
			index--;
		}
		int digitVerificator = (total * 10) % 11;
		return digitVerificator == 10 ? 0 : digitVerificator;
	}

}
