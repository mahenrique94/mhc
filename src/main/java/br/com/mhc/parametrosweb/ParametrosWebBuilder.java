package br.com.mhc.parametrosweb;

import java.util.List;

public class ParametrosWebBuilder {

	private ParametrosWebQuery parametrosWebQuery = new ParametrosWebQuery();
	private ParametrosWebFrom parametrosWebFrom = new ParametrosWebFrom();
	private ParametrosWebWhere parametrosWebWhere = new ParametrosWebWhere();
	private ParametrosWebOrderBy parametrosWebOrderBy = new ParametrosWebOrderBy();
	
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
		getParametrosWebQuery().setFrom(getParametrosWebFrom().from(clazz).build(parametrosWeb));
		getParametrosWebQuery().setWhere(getParametrosWebWhere().from(clazz).build(parametrosWeb));
		getParametrosWebQuery().setOrderBy(getParametrosWebOrderBy().build(parametrosWeb));
		return getParametrosWebQuery().build();
	}
	
}
