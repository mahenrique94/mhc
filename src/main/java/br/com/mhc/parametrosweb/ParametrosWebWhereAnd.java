package br.com.mhc.parametrosweb;

import java.util.Collection;

/** @auth Matheus Castiglioni
 *  Classe responsável por construir os parâmetros da SQL quando a junção se trata de um AND,
 *  separei as responsabilidades em classes diferentes pois quando se trata de AND os parâmetros não devem estar dentro de ()
 *  Ex: campo1 = valor1 and campo2 > valor2
 */
public class ParametrosWebWhereAnd extends ParametrosWebWhereAndOr {

	@Override
	public Collection build(Object... parametros) {
		// TODO Auto-generated method stub
		Collection where = super.build(parametros);
		if (parametros[this.posicaoIsOr].toString().equals("true"))
			where.add("and");
		return where;
	}

}
