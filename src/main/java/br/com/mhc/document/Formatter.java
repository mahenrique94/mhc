package br.com.mhc.document;

import br.com.mhc.function.StringFunction;

public interface Formatter {

	default String format(String pattern, String mask, String document) {
		return StringFunction.format(pattern, mask, document);
	}
	
	default String unformat(String document) {
		return document.replaceAll("[\\.\\-\\/]", "");
	}
	
}
