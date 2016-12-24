package br.com.mhc.string;

public class TestaRegex {

	public static void main(String[] args) {
		String s = "4630 - MOD. 15 S/N' A'";
		System.out.println(s.replaceAll("(([^0-9])([^S\\/N\\']?))", ""));
	}
	
}
