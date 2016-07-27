package br.com.mhc.function;

public class StringFunction {
	
	public static String capitalize(String string) {
		return string.substring(0, 1).toUpperCase().concat(string.substring(1));
	}
	
	public static String splitBarToFirstUpper(String string) {
		String[] split = string.split("/");
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < split.length; i++) {
			String s = split[i]; 
			if (i > 0)
				s = StringFunction.capitalize(split[i]);
			builder.append(s);	
		}
		return builder.toString();
	}

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
