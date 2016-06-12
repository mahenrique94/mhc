package br.com.mhc.function;

public class StringFunction {

	public static String trimAll(String string) {
		return string.replaceAll("\\s", "");
	}
	
	public static String trimLeft(String string) {
		return string.replaceAll("^\\s", "");
	}
	
	public static String trimRight(String string) {
		return string.replaceAll("\\s$", "");
	}
	
}
