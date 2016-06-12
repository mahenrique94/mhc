package br.com.mhc.tdd;

public class Recursive {

	public static void main(String[] args) {
		int fatorial = 5;
		System.out.println(calcula(fatorial));
	}
	
	public static int calcula(int numero) {
		if (numero == 0)
			return 1;
		return numero * calcula(numero - 1);
	}
	
}
