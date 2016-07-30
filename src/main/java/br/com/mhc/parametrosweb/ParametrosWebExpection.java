package br.com.mhc.parametrosweb;

/** @auth Matheus Castiglioni
 *  Classe responsável por lançar as excpetions do tipo ParametrosWeb para que eu possa saber que houve um erro
 *  durante a construção da SQL
 */
public class ParametrosWebExpection extends RuntimeException {

	public ParametrosWebExpection(String exception) {
		// TODO Auto-generated constructor stub
		super(exception);
	}
	
}
