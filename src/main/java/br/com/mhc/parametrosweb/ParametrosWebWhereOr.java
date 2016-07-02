package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collection;



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
