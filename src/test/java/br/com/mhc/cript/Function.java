package br.com.mhc.cript;

public class Function {

	public static String fromAsciiToChar(int ascii) {
		return Character.toString((char) ascii);
	}
	
	public static int fromCharToAscii(char c) {
		return String.valueOf(c).codePointAt(0);
	}
	
	public static String fromDecimalToBinary(int number) {
		StringBuilder binary = new StringBuilder();
		int rest = 0;
		int result = 0;
		while((number / 2) > 0) {
			rest = number % 2;
			result = (int) number / 2;
			binary.append(rest);
			if ((result % 2) == 1 && (result / 2) == 0)
				binary.append(1);
			number = result;
		}
		return binary.reverse().toString();
	}
	
	public static int fromBinaryToDecimal(String number) {
		int result = 0;
		String reverse = Function.reverse(number);
		for (int i = 0; i < number.length(); i++) {
			char c = reverse.charAt(i);
			int bit = Integer.parseInt(String.valueOf(c));
			int resultBit = (int) (bit * Math.pow(2, i));
			result += resultBit;
		}
		return result;
	}
	
	public static String reverse(String string) {
		StringBuilder builder = new StringBuilder(string);
		builder.reverse();
		return builder.toString();
	}
	
}
