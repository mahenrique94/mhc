package br.com.mhc.parametrosweb;

import java.util.Collection;

/** @auth Matheus Castiglioni
 *  Interface para transformar todas as classes em um Operador e futuramente busca-los via Factory,
 */
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
