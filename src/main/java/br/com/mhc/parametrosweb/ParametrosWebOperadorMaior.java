package br.com.mhc.parametrosweb;

import java.util.Arrays;
import java.util.Collection;

/** @auth Matheus Castiglioni
 *  Classe responsável por pegar o parâmetro >,
 *  separei esse parâmetro pois quando não se trata de Calendar o mesmo não deve ser passado entre ',
 *  caso o parâmetroFinal tenha valor o mesmo será devolvido também(Ex: campo1 > 10 and campo1 < 10)
 *  senão será devolvido apenas o parametroInicial(Ex: campo1 > 10)
 */
public class ParametrosWebOperadorMaior implements ParametrosWebOperador {

	@Override
	public Collection build(String campo, String parametroInicial, String parametroFinal) {
		// TODO Auto-generated method stub
		if (parametroFinal != null)
			return Arrays.asList(this.campo(campo), ">", parametroInicial, this.juncao(), this.campo(campo), "<", parametroFinal);
		return Arrays.asList(this.campo(campo), ">", parametroInicial);
	}

}
