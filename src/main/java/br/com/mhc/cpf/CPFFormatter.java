package br.com.mhc.cpf;

import br.com.mhc.function.StringFunction;

public abstract class CPFFormatter {

	public static String format(String cpf) {
		return StringFunction.format("###.###.###-##", cpf);
	}
	
	public static String unformat(String cpf) {
		return cpf.replaceAll("[\\.\\-]", "");
	}
	
}
