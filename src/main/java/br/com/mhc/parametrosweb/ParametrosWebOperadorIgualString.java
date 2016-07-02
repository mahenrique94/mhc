package br.com.mhc.parametrosweb;

import java.util.Arrays;
import java.util.Collection;

public class ParametrosWebOperadorIgualString implements ParametrosWebOperador {

	@Override
	public Collection build(String campo, String parametroInicial, String parametroFinal) {
		// TODO Auto-generated method stub
		return Arrays.asList(this.campo(campo), "=", "'" + parametroInicial + "'");
	}

}
