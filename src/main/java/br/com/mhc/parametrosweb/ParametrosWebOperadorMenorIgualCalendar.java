package br.com.mhc.parametrosweb;

import java.util.Arrays;
import java.util.Collection;

import br.com.mhc.function.DateFunction;

/** @auth Matheus Castiglioni
 *  Classe responsável por pegar o parâmetro <= para o tipo Calendar,
 *  separei esse parâmetro pois quando se trata de Calendar o mesmo deve ser passado entre '
 *  Ex: campo1 <= '1994-05-25'
 */
public class ParametrosWebOperadorMenorIgualCalendar implements ParametrosWebOperador {

	@Override
	public Collection build(String campo, String parametroInicial, String parametroFinal) {
		// TODO Auto-generated method stub
		return Arrays.asList(this.campo(campo), "<=", "'" + DateFunction.formatBrazilianToAmerican(parametroInicial) + "'");
	}

}
