package br.com.mhc.parametrosweb;

import java.util.Arrays;
import java.util.Collection;

public class ParametrosWebOperadorMaior implements ParametrosWebOperador {

	@Override
	public Collection build(String campo, String parametroInicial, String parametroFinal) {
		// TODO Auto-generated method stub
		if (parametroFinal != null)
			return Arrays.asList(this.campo(campo), ">", parametroInicial, this.juncao(), this.campo(campo), "<", parametroFinal);
		return Arrays.asList(this.campo(campo), ">", parametroInicial);
	}

}
