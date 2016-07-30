package br.com.mhc.parametrosweb;

import java.util.Arrays;
import java.util.Collection;

/** @auth Matheus Castiglioni
 *  Classe responsável por pegar o parâmetro =,
 *  separei esse parâmetro pois quando não se trata de Calendar o mesmo não deve ser passado entre '
 *  Ex: campo1 = 10
 */
public class ParametrosWebOperadorIgual implements ParametrosWebOperador {

	@Override
	public Collection build(String campo, String parametroInicial, String parametroFinal) {
		// TODO Auto-generated method stub
		return Arrays.asList(this.campo(campo), "=", parametroInicial);
	}
	
}
