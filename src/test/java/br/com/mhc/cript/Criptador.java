package br.com.mhc.cript;

public class Criptador {

	public String encripta(String word) {
		StringBuilder criptografada = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			criptografada.append(Function.fromAsciiToChar(algorit(Function.fromCharToAscii(letter))));
		}
		return criptografada.toString();
	}
	
	private int algorit(int ascii) {
		return (int) ascii * 2;
	}
	
	public int key(String word) {
		int key = 0;
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			key += Function.fromCharToAscii(letter);
		}
		return (key / 2); 
	}
	
}
