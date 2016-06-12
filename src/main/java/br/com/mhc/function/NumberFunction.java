package br.com.mhc.function;

public class NumberFunction {

	public static boolean isNumeric(String string) {
		boolean resultado = true;
		for (int i = 0; i < string.length(); i++) {
			char verificador = string.toLowerCase().charAt(i);
			if ((Character.isLetter(verificador)) || (verificador == '.') || (verificador == '/') || (verificador == '-')) {
				resultado = false;
				break;
			}
		}
		return resultado;
	}
	
}
