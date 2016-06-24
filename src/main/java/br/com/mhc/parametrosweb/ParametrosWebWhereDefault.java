package br.com.mhc.parametrosweb;

import java.util.List;

public abstract class ParametrosWebWhereDefault implements ParametrosWebWhereSQL {

	private StringBuilder sql = new StringBuilder(" where ");
	private final Parametros parametros = new Parametros();
	
	public StringBuilder getSql() {
		return sql;
	}
	public Parametros getParametros() {
		return parametros;
	}
	
	protected boolean isInvalid(List<String> predicates) {
		if (predicates == null)
			return true;
		if (predicates.get(0) == null && predicates.get(1) == null)
			return true;
		return false;
	}
	
	protected boolean isLastParametro(int atual, int maximo) {
		return atual == maximo;
	}
	
}
