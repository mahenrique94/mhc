package br.com.mhc.document;

public class ValidaDocument {

	public static void main(String[] args) {
		Document doc = new CPF("367.872.198-22");
//		Document doc = new CNPJ("61.646.949/0001-58");
		System.out.println(doc.format());
		System.out.println(doc.unformat());
		System.out.println(doc.getFirstDigit());
		System.out.println(doc.getSecondDigit());
		System.out.println(doc.isValid());
	}
	
}
