package br.com.mhc.cpf;

public enum CPFPattern {

	PATTERN_FORMAT("(([0-9]{3})+([\\.])([0-9]{3})+([\\.])([0-9]{3})+([\\-])+([0-9]{2}))"),
	PATTERN_UNFORMAT("([0-9]{11})"),
	REGEX_REPEAT("([0]{11})|([1]{11})|([2]{11})|([3]{11})|([4]{11})|([5]{11})|([6]{11})|([7]{11})|([8]{11})|([9]{11})");
	
	private String pattern;
	
	private CPFPattern(String pattern) {
		this.pattern = pattern;
	}
	
	public String getPattern() {
		return pattern;
	}
	
}
