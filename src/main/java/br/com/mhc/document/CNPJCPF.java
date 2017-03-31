package br.com.mhc.document;

import br.com.mhc.function.StringFunction;

public abstract class CNPJCPF implements Document {
	
	private String cnpjCpf;
	private Formatter formatter;
	private String pattern;
	private String mask;
	private Validator validator;
	
	public String getCnpjCpf() {
		return cnpjCpf;
	}
	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}
	public Formatter getFormatter() {
		return formatter;
	}
	public void setFormatter(Formatter formatter) {
		this.formatter = formatter;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getMask() {
		return mask;
	}
	public void setMask(String mask) {
		this.mask = mask;
	}
	public Validator getValidator() {
		return validator;
	}
	public void setValidator(Validator validator) {
		this.validator = validator;
	}
	
	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return getValidator().isValid(this);
	}

	@Override
	public String format() {
		// TODO Auto-generated method stub
		return getFormatter().format(getPattern(), getMask(), getCnpjCpf());
	}

	@Override
	public String unformat() {
		// TODO Auto-generated method stub
		return getFormatter().unformat(getCnpjCpf());
	}

	@Override
	public int getFirstDigit() {
		// TODO Auto-generated method stub
		String cpf = getCnpjCpf();
		if (isFormated())
			cpf = unformat();
		return Integer.parseInt(cpf.substring((unformat().length() - 2), (unformat().length() - 1)));
	}

	@Override
	public int getSecondDigit() {
		// TODO Auto-generated method stub
		String cpf = getCnpjCpf();
		if (isFormated())
			cpf = unformat();
		return Integer.parseInt(cpf.substring((unformat().length() - 1), unformat().length()));
	}

	@Override
	public String[] getNumbersToFirstDigit() {
		// TODO Auto-generated method stub
		return StringFunction.substringToArray(unformat(), 0, (unformat().length() - 2));
	}

	@Override
	public String[] getNumbersToSecondDigit() {
		// TODO Auto-generated method stub
		return StringFunction.substringToArray(unformat(), 0, (unformat().length() - 1));
	}

	@Override
	public boolean isFormated() {
		// TODO Auto-generated method stub
		return getCnpjCpf().indexOf(".") > 0 || getCnpjCpf().indexOf("-") > 0 || getCnpjCpf().indexOf("/") > 0;
	}

}
