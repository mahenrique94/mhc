package br.com.mhc.document;

public class CNPJValidator implements Validator {
	
	private static final int[] NUMBERS_FIRST_DIGIT = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
	private static final int[] NUMBERS_SECOND_DIGIT = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

	@Override
	public int calculateDigit(String[] numbers) {
		// TODO Auto-generated method stub
		int[] digits = numbers.length == 13 ? NUMBERS_FIRST_DIGIT : NUMBERS_SECOND_DIGIT;
		int total = 0;
		for (int i = 0; i < (numbers.length - 1); i++) {
			total += (Integer.parseInt(numbers[i]) * digits[i]);
		}
		return (total % 11) < 2 ? 0 : (11 - (total % 11));
	}

}
