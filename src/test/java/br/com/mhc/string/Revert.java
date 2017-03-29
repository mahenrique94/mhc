package br.com.mhc.string;

public class Revert {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Matheus");
		String s = sb.reverse().toString();
		System.out.println(s);
		System.out.println(new StringBuilder(s).reverse().toString());
	}
	
}
