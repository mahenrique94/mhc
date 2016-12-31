package br.com.mhc.document;

public enum Pattern {

	CPF("###.###.###-##", "([0]{11})|([1]{11})|([2]{11})|([3]{11})|([4]{11})|([5]{11})|([6]{11})|([7]{11})|([8]{11})|([9]{11})"),
	CNPJ("##.###.###/####-##", "([0]{14})|([1]{14})|([2]{14})|([3]{14})|([4]{14})|([5]{14})|([6]{14})|([7]{14})|([8]{14})|([9]{14})");
	
	private String pattern;
	private String repeat;
	
	private Pattern(String pattern, String repeat) {
		this.pattern = pattern;
		this.repeat = repeat;
	}
	
	public String getPattern() {
		return pattern;
	}
	public String getRepeat() {
		return repeat;
	}
	
}
