package br.com.mhc.document;

public class CNPJ extends CNPJCPF {
	
	public CNPJ(String cnpj) {
		super.setCnpjCpf(cnpj);
		super.setFormatter(new CNPJFormatter());
		super.setPattern("(([\\d]{2})([\\d]{3})([\\d]{3})([\\d]{4})([\\d]{2}))");
		super.setMask("$2.$3.$4/$5-$6");
		super.setValidator(new CNPJValidator());
	}

}
