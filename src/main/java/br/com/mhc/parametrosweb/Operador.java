package br.com.mhc.parametrosweb;

import java.util.List;

public interface Operador {

	default String get(List<String> parametro, String operador, String type) {
		if (type.equals("String"))
			return operador + " '%" + parametro.get(1) + "%'";
		return operador + " " + parametro.get(1);
	};
	
	String get(List<String> parametro);
	
}
