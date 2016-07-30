package br.com.mhc.cript;

public class TestaCriptografia {

	public static void main(String[] args) {
		Criptador cript = new Criptador();
		Descriptador descript = new Descriptador();
		String s = "Diego";
		System.out.println(cript.encripta(s));
		System.out.println(descript.descripta(cript.encripta(s)));
	}
	
}
