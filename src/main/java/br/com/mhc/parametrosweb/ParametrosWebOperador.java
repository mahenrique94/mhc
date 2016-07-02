package br.com.mhc.parametrosweb;

import java.util.Collection;

public interface ParametrosWebOperador {

	Collection build(String campo, String parametroInicial, String parametroFinal);
	
	default String alias() {
		return "a.";
	}
	
	default String campo(String campo) {
		return alias().concat(campo);
	}
	
	default String juncao() {
		return "and";
	}
	
}
