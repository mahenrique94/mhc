package br.com.mhc.cpf;

import br.com.mhc.function.StringFunction;

public class CPF {

	private String cpf;
	
	public CPF(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean isValid() {
		return CPFValidator.isValid(this);
	}
	
	public int getFirstDigit() {
		String cpf = getCpf();
		if (isFormatted())
			cpf = simple();
		return Integer.parseInt(cpf.substring(9, 10));
	}
	
	public int getSecondDigit() {
		String cpf = getCpf();
		if (isFormatted())
			cpf = simple();
		return Integer.parseInt(cpf.substring(10, 11));
	}
	
	public String format() {
		return StringFunction.format("###.###.###-##", getCpf());
	}
	
	public String simple() {
		return getCpf().replace(".", "").replace("-", "");
	}
	
	protected String[] getNumbersToFirstDigit() {
		return StringFunction.substringToArray(simple(), 0, 9);
	}
	
	protected String[] getNumbersToSecondDigit() {
		return StringFunction.substringToArray(simple(), 0, 10);
	}
	
	private boolean isFormatted() {
		return getCpf().indexOf(".") > 0 || getCpf().indexOf("-") > 0;
	}
	
}
