package br.com.mhc.string;

public class TestaReplace {

	public static void main(String[] args) {
		String cpf = "367.872.198-22";
		String regex = "(([\\d]{3})([\\d]{3})([\\d]{3})([\\d]{2}))";
		System.out.println(cpf.replaceAll(regex, "$2.$3.$4-$5"));
	}
	
}
