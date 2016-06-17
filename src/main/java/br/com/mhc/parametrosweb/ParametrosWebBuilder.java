package br.com.mhc.parametrosweb;

import java.util.List;

public class ParametrosWebBuilder {

	private final ParametrosWebQuery parametrosWebQuery = new ParametrosWebQuery();
	private final ParametrosWebFrom parametrosWebFrom = new ParametrosWebFrom();
	private final ParametrosWebWhere parametrosWebWhere = new ParametrosWebWhere();
	private final ParametrosWebOrderBy parametrosWebOrderBy = new ParametrosWebOrderBy();
	
	public ParametrosWebQuery getParametrosWebQuery() {
		return parametrosWebQuery;
	}
	public ParametrosWebFrom getParametrosWebFrom() {
		return parametrosWebFrom;
	}
	public ParametrosWebWhere getParametrosWebWhere() {
		return parametrosWebWhere;
	}
	public ParametrosWebOrderBy getParametrosWebOrderBy() {
		return parametrosWebOrderBy;
	}
	
	public String execute(Class<?> clazz, List<ParametrosWeb> parametrosWeb) {
		// TODO Auto-generated method stub
		if (parametrosWeb != null && !parametrosWeb.isEmpty()) {
			getParametrosWebQuery().setFrom(getParametrosWebFrom().from(clazz).build(parametrosWeb));
			getParametrosWebQuery().setWhere(getParametrosWebWhere().from(clazz).build(parametrosWeb));
			getParametrosWebQuery().setOrderBy(getParametrosWebOrderBy().build(parametrosWeb));
		} else {
			getParametrosWebQuery().setFrom(getParametrosWebFrom().from(clazz).build(parametrosWeb));
		}
		return getParametrosWebQuery().build();
	}
	
}
