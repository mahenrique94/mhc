package br.com.mhc.parametrosweb;

import java.util.List;

public class OperadorMaior implements Operador {

	@Override
	public String get(List<String> parametro) {
		// TODO Auto-generated method stub
		return "> " + parametro.get(1);
	}

}