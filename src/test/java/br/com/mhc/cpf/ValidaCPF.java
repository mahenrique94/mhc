package br.com.mhc.cpf;

public class ValidaCPF {

	public static void main(String[] args) {
		CPF cpf = new CPF("367.872.198-22");
		System.out.println(cpf.isValid());
	}
	
}
