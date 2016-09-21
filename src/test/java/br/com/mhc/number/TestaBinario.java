package br.com.mhc.number;

import br.com.mhc.function.NumberFunction;

public class TestaBinario {

	public static void main(String[] args) {
		System.out.println(NumberFunction.fromDecimalToBinary(15));
		System.out.println(NumberFunction.fromBinaryToDecimal(NumberFunction.fromDecimalToBinary(15)));
	}
	
}
