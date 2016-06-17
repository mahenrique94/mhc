package br.com.mhc.parametrosweb;

import java.util.List;

public class OperadorMaiorIgual implements Operador {

	@Override
	public String get(List<String> parametro) {
		// TODO Auto-generated method stub
		if (parametro.get(2) != null)
			return ">= " + parametro.get(1) + " and a." + parametro.get(0) + " <= " + parametro.get(2);
		else
			return ">= " + parametro.get(1);
	}

}
