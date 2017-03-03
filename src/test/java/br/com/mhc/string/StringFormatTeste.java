package br.com.mhc.string;

public class StringFormatTeste {

	public static void main(String[] args) {
		System.out.println(String.format("%010d %60s %3.2f", 1201, "Matheus Henrique Castiglioni".toUpperCase(), 1254.30));
		System.out.println(String.format("%010d %60s %3.2f", 41201, "Joao Victor".toUpperCase(), 14.30));
		System.out.println(String.format("%010d %60s %3.2f", 122, "Fernando da Silva".toUpperCase(), 1230.0));
	}
	
}
