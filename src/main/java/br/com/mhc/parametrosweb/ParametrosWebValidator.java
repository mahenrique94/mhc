package br.com.mhc.parametrosweb;

/** @auth Matheus Castiglioni
 *  Classe responsável por agrupar todas as validações durante o processo de construção da SQL
 */
public class ParametrosWebValidator {

	public boolean validaFrom(Class<?> clazz) {
		if (clazz == null && clazz.isAnnotation() && clazz.isArray() && clazz.isEnum() && clazz.isInterface())
			throw new ParametrosWebExpection("Atenção, a classe não pode ser: nula, anotação, array, enum ou uma interface");
		return true;
	}
	
	public boolean validaWhere(String campo, String parametroInicial) {
		if (campo == null || parametroInicial == null)
			throw new ParametrosWebExpection("Atenção, para criar as opções de where o campo e o parametro inicial não podem ser nulos");
		return true;
	}
	
	public boolean validaOrderBy(String campo) {
		if (campo == null)
			throw new ParametrosWebExpection("Atenção, para criar o order by os campos não podem ser nulos");
		return true;
	}
	
}
