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
		for (int i = 0; i < (predicates.size() - 1); i++) {
			if (predicates.get(i) == null)
				return true;
		}
		return false;
	}
	
	protected boolean isLastParametro(int atual, int maximo) {
		return atual == maximo;
	}
	
}
