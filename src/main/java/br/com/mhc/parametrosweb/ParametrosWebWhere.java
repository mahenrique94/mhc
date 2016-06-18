package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.mhc.function.ClassFunction;
import br.com.mhc.model.Pessoa;

public class ParametrosWebWhere implements ParametrosWebSQL {

	private StringBuilder sql = new StringBuilder();
	private final Parametros parametros = new Parametros();
	private List<List<String>> predicatesAnd = new ArrayList<List<String>>();
	private List<List<String>> predicatesOr = new ArrayList<List<String>>();
	private Class<?> clazz;
	private final ParametrosWebWhereAnd parametrosWebWhereAnd = new ParametrosWebWhereAnd();
	private final ParametrosWebWhereAndOr parametrosWebWhereAndOr = new ParametrosWebWhereAndOr();
	private final ParametrosWebWhereOr parametrosWebWhereOr = new ParametrosWebWhereOr();
	
	public StringBuilder getSql() {
		return sql;
	}
	public Parametros getParametros() {
		return parametros;
	}
	public List<List<String>> getPredicatesAnd() {
		return Collections.unmodifiableList(predicatesAnd);
	}
	public List<List<String>> getPredicatesOr() {
		return Collections.unmodifiableList(predicatesOr);
	}
	public Class<?> getClazz() {
		return clazz;
	}
	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}
	public ParametrosWebWhereAnd getParametrosWebWhereAnd() {
		return parametrosWebWhereAnd;
	}
	public ParametrosWebWhereAndOr getParametrosWebWhereAndOr() {
		return parametrosWebWhereAndOr;
	}
	public ParametrosWebWhereOr getParametrosWebWhereOr() {
		return parametrosWebWhereOr;
	}
	
	public ParametrosWebWhere from(Class<?> clazz) {
		setClazz(clazz);
		return this;
	}
	
	@Override
	public String build(List<ParametrosWeb> parametrosWeb) {
		// TODO Auto-generated method stub
		setCamposParametros(parametrosWeb);
		if (!getPredicatesAnd().isEmpty() && getPredicatesOr().isEmpty())
			getSql().append(getParametrosWebWhereAnd().build(getClazz(), parametrosWeb, getPredicatesAnd()));
		if (!getPredicatesAnd().isEmpty() && !getPredicatesOr().isEmpty())
			getSql().append(getParametrosWebWhereAndOr().build(getClazz(), parametrosWeb, getPredicatesAnd()));
		if (!getPredicatesOr().isEmpty())
			getSql().append(getParametrosWebWhereOr().build(getClazz(), parametrosWeb, getPredicatesOr()));
		return getSql().toString();
	}
	
	private void setCamposParametros(List<ParametrosWeb> parametrosWeb) {
		parametrosWeb.forEach(parametro -> {
			List<String> predicate = new ArrayList<String>();
			predicate.add(parametro.getCampo());
			predicate.add(parametro.getParametroInicial());
			predicate.add(parametro.getParametroFinal());
			if (parametro.getJuncao().equals("and"))
				this.predicatesAnd.add(predicate);
			else
				this.predicatesOr.add(predicate);
		});
	}
	
}
