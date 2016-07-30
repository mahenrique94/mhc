package br.com.mhc.parametrosweb;

import java.util.Arrays;
import java.util.Collection;

import br.com.mhc.function.DateFunction;

/** @auth Matheus Castiglioni
 *  Classe responsável por pegar o parâmetro >= para o tipo Calendar,
 *  separei esse parâmetro pois quando se trata de Calendar o mesmo deve ser passado entre ',
 *  caso o parâmetroFinal tenha valor o mesmo será devolvido também(Ex: campo1 >= '1994-05-25' and campo1 <= '1994-05-25')
 *  senão será devolvido apenas o parametroInicial(Ex: campo1 >= '1994-05-25')
 */
public class ParametrosWebOperadorMaiorIgualCalendar implements ParametrosWebOperador {

	@Override
	public Collection build(String campo, String parametroInicial, String parametroFinal) {
		// TODO Auto-generated method stub
		if (parametroFinal != null)
			return Arrays.asList(this.campo(campo), ">=", "'" + DateFunction.formatBrazilianToAmerican(parametroInicial) + "'", this.juncao(), this.campo(campo), "<=", "'" + DateFunction.formatBrazilianToAmerican(parametroFinal) + "'");
		return Arrays.asList(this.campo(campo), ">=", "'" + DateFunction.formatBrazilianToAmerican(parametroInicial) + "'");
	}

}
