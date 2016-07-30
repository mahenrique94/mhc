package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collection;

/** @auth Matheus Castiglioni
 *  Classe responsável por construir os parâmetros da SQL quando a junção se trata de um OR,
 *  separei as responsabilidades em classes diferentes pois quando se trata de OR os parâmetros devem estar dentro de ()
 *  Ex: (campo1 = valor1 or campo2 > valor2)
 */
public class ParametrosWebWhereOr extends ParametrosWebWhereAndOr {

	@Override
	public Collection build(Object... parametros) {
		// TODO Auto-generated method stub
		Collection<Object> where = new ArrayList<Object>();
		where.add("(");
		where.addAll(super.build(parametros));
		where.add(")");
		return where;
	}

}
