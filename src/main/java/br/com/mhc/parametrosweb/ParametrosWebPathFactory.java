package br.com.mhc.parametrosweb;

public class ParametrosWebPathFactory {

	public static ParametrosWebPath find(String typeField) {
		ParametrosWebPath parametrosWebPath = null;
		if (typeField.equals("String"))
			parametrosWebPath = new ParametrosWebPathString();
		return parametrosWebPath;
	}
	
}
