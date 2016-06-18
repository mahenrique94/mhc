package br.com.mhc.parametrosweb;

import java.util.List;

import br.com.mhc.function.DateFunction;

public class OperadorMaiorIgualCalendar implements Operador {

	@Override
	public String get(List<String> parametro) {
		// TODO Auto-generated method stub
		return ">= '" + DateFunction.formatBrazilianToAmerican(parametro.get(1)) + "' and a." + DateFunction.formatBrazilianToAmerican(parametro.get(0)) + " <= '" + DateFunction.formatBrazilianToAmerican(parametro.get(2)) + "'";
	}

}
