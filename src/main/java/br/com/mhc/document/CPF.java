package br.com.mhc.document;

public class CPF extends CNPJCPF {
	
	public CPF(String cpf) {
		super.setCnpjCpf(cpf);
		super.setFormatter(new CPFFormatter());
		super.setPattern(Pattern.CPF);
		super.setValidator(new CPFValidator());
	}

}
