package br.com.mhc.cript;

public class Descriptador {

	public String descripta(String palavra) {
		StringBuilder criptografada = new StringBuilder();
		for (int i = 0; i < palavra.length(); i++) {
			char letter = palavra.charAt(i);
			criptografada.append(Function.fromAsciiToChar(algorit(Function.fromCharToAscii(letter))));
		}
		return criptografada.toString();
	}
	
	private int algorit(int ascii) {
		return (int) ascii / 2;
	}
	
}
