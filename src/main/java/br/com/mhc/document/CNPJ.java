package br.com.mhc.document;

public class CNPJ extends CNPJCPF {
	
	public CNPJ(String cnpj) {
		super.setCnpjCpf(cnpj);
		super.setFormatter(new CNPJFormatter());
		super.setPattern(Pattern.CNPJ);
		super.setValidator(new CNPJValidator());
	}

}
