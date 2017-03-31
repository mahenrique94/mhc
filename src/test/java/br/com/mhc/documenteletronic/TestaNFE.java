package br.com.mhc.documenteletronic;

public class TestaNFE {

	public static void main(String[] args) {
		NFE nfe = new NFE("31170306288354000160550010000069461172409046");
		System.out.println(nfe.isValid());
		System.out.println(nfe.getUF());
		System.out.println(nfe.getMonth());
		System.out.println(nfe.getYear());
		System.out.println(nfe.getCnpj().format());
		System.out.println(nfe.getModel());
		System.out.println(nfe.getSerie());
		System.out.println(nfe.getNumber());
		System.out.println(nfe.getEmissao());
		System.out.println(nfe.getCode());
		System.out.println(nfe.getDigit());
	}
	
}
