package br.com.mhc.document;

public class CPF extends CNPJCPF {
	
	public CPF(String cpf) {
		super.setCnpjCpf(cpf);
		super.setFormatter(new CPFFormatter());
		super.setPattern("(([\\d]{3})([\\d]{3})([\\d]{3})([\\d]{2}))");
		super.setMask("$2.$3.$4-$5");
		super.setValidator(new CPFValidator());
	}

}
