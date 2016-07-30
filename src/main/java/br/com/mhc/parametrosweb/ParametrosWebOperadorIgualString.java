package br.com.mhc.parametrosweb;

import java.util.Arrays;
import java.util.Collection;

/** @auth Matheus Castiglioni
 *  Classe responsável por pegar o parâmetro = para o tipo String,
 *  separei esse parâmetro pois quando se trata de String o mesmo deve ser passado entre '
 *  Ex: campo1 = 'Matheus'
 */
public class ParametrosWebOperadorIgualString implements ParametrosWebOperador {

	@Override
	public Collection build(String campo, String parametroInicial, String parametroFinal) {
		// TODO Auto-generated method stub
		return Arrays.asList(this.campo(campo), "=", "'" + parametroInicial + "'");
	}

}
