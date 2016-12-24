package br.com.mhc.cpf;

import br.com.mhc.function.StringFunction;

public abstract class CPFFormatter {

	public static String format(String cpf) {
		if (StringFunction.isMatcher(CPFPattern.PATTERN_FORMAT.getPattern(), cpf))
			return cpf;
		return StringFunction.format("###.###.###-##", cpf);
	}
	
	public static String unformat(String cpf) {
		if (StringFunction.isMatcher(CPFPattern.PATTERN_UNFORMAT.getPattern(), cpf))
			return cpf;
		return cpf.replaceAll("[\\.\\-]", "");
	}
	
}
