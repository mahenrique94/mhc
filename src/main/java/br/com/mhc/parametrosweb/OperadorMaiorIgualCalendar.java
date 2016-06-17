package br.com.mhc.parametrosweb;

import java.util.List;

public class OperadorMaiorIgualCalendar implements Operador {

	@Override
	public String get(List<String> parametro) {
		// TODO Auto-generated method stub
		return ">= '" + parametro.get(1) + "' and a." + parametro.get(0) + " <= '" + parametro.get(2) + "'";
	}

}
