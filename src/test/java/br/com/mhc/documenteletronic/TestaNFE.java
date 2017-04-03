package br.com.mhc.documenteletronic;

public class TestaNFE {

	public static void main(String[] args) {
		NFE nfe = new NFE("41161005622426000109550010000030071879328711");
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
