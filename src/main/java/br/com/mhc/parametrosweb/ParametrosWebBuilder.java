package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import br.com.mhc.function.StringFunction;

public class ParametrosWebBuilder {

	private final ParametrosWeb parametrosWeb = new ParametrosWeb();
	
	public ParametrosWeb getParametrosWeb() {
		return parametrosWeb;
	}
	public Object getClazz() {
		return getParametrosWeb().getClazz();
	}
	
	public ParametrosWebBuilder from(Class clazz) {
		getParametrosWeb().setClazz(clazz);
		return this;
	}
	
	public ParametrosWebBuilder where(String where, Object obj) {
		List<String> wheres = Arrays.asList(where.split(","));
		getParametrosWeb().setWhere(new ArrayList<String>(wheres));
		wheres.forEach(parametro -> {
			parametro = StringFunction.trimLeft(parametro);
			getParametrosWeb().getParametros().add(parametro.substring(0, parametro.indexOf(" ")));
		});
		getParametrosWeb().setObj(obj);
		return this;
	}
	
	public ParametrosWebBuilder orderBy(String orderBy) {
		getParametrosWeb().setOrderBy(orderBy);
		return this;
	}
	
	public ParametrosWebBuilder limit(Integer limit) {
		getParametrosWeb().setLimit(limit);
		return this;
	}
	
	public CriteriaQuery<?> execute(CriteriaBuilder criteriaBuilder) {
		return ParametrosWebQuery.create(getParametrosWeb(), criteriaBuilder, (Class) getClazz());
	}
	
}
