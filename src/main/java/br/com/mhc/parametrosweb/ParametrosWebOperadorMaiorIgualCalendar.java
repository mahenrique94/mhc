package br.com.mhc.parametrosweb;

import java.util.Arrays;
import java.util.Collection;

import br.com.mhc.function.DateFunction;

public class ParametrosWebOperadorMaiorIgualCalendar implements ParametrosWebOperador {

	@Override
	public Collection build(String campo, String parametroInicial, String parametroFinal) {
		// TODO Auto-generated method stub
		if (parametroFinal != null)
			return Arrays.asList(this.campo(campo), ">=", "'" + DateFunction.formatBrazilianToAmerican(parametroInicial) + "'", this.juncao(), this.campo(campo), "<=", "'" + DateFunction.formatBrazilianToAmerican(parametroFinal) + "'");
		return Arrays.asList(this.campo(campo), ">=", "'" + DateFunction.formatBrazilianToAmerican(parametroInicial) + "'");
	}

}
