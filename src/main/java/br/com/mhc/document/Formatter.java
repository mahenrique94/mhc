package br.com.mhc.document;

import br.com.mhc.function.StringFunction;

public interface Formatter {

	default String format(Pattern pattern, String document) {
		return StringFunction.format(pattern.getPattern(), document);
	}
	
	default String unformat(String document) {
		return document.replaceAll("[\\.\\-\\/]", "");
	}
	
}
