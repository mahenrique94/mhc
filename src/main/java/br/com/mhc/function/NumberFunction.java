package br.com.mhc.function;

import br.com.mhc.cript.Function;

public class NumberFunction {

	/** @auth Matheus Castiglioni
	 *  Pega um número no formato binário e converte o mesmo para inteiro
	 *  @param s - Numero binário em String a ser convertido para int
	 *  @return result - Número binário em String convertido para int
	 *  @example NumberFunction.fromBinaryToDecimal("10011");
	 *  @result 19
	 */
	public static int fromBinaryToDecimal(String s) {
		int result = 0;
		String reverse = Function.reverse(s);
		for (int i = 0; i < s.length(); i++) {
			char c = reverse.charAt(i);
			int bit = Integer.parseInt(String.valueOf(c));
			int resultBit = (int) (bit * Math.pow(2, i));
			result += resultBit;
		}
		return result;
	}
	
	/** @auth Matheus Castiglioni
	 *  Pega um número no formato inteiro e converte o mesmo para binário
	 *  @param n - Numero binário em inteiro a ser convertido para String
	 *  @return binary - Número binário em inteiro convertido para String
	 *  @example NumberFunction.fromDecimalToBinary(19);
	 *  @result "10011"
	 */
	public static String fromDecimalToBinary(int n) {
		StringBuilder binary = new StringBuilder();
		int rest = 0;
		int result = 0;
		while((n / 2) > 0) {
			rest = n % 2;
			result = (int) n / 2;
			binary.append(rest);
			if ((result % 2) == 1 && (result / 2) == 0)
				binary.append(1);
			n = result;
		}
		return binary.reverse().toString();
	}
	
	/** @auth Matheus Castiglioni
	 *  Recebe uma determinada String e verifica se a mesma é uma palavra ou numero
	 *  @param s - String á ser verificada
	 *  @return resultado - Retorna true(Verdadeiro) se for um numero e false(Falso) se for uma palavra
	 *  @example NumberFunction.isNumeric("Matheus");
	 *  @result false
	 */
	public static boolean isNumeric(String s) {
		boolean resultado = true;
		for (int i = 0; i < s.length(); i++) {
			char verificador = s.toLowerCase().charAt(i);
			if ((Character.isLetter(verificador)) || (verificador == '.') || (verificador == '/') || (verificador == '-')) {
				resultado = false;
				break;
			}
		}
		return resultado;
	}
	
	/** @auth Matheus Castiglioni
	 *  Pega determinado número do tipo double e fazer o arredondamento do mesmo
	 *  @param d - Número á ser arredondado
	 *  @return d - Número já arredondado
	 *  @example NumberFunction.round(25.02918203);
	 *  @result 25.02
	 */
	public static double round(double d) {
		return Math.round(d * 100.0) / 100.0;
	}
	
}
