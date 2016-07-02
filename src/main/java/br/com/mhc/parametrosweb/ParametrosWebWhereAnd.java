package br.com.mhc.parametrosweb;

import java.util.Collection;


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
