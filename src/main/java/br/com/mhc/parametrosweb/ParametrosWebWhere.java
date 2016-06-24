package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.mhc.function.ClassFunction;
import br.com.mhc.model.Pessoa;

public class ParametrosWebWhere extends ParametrosWebSQLDefault {

	private List<ParametrosWeb> parametrosWebAnd = new ArrayList<ParametrosWeb>();
	private List<ParametrosWeb> parametrosWebOr = new ArrayList<ParametrosWeb>();
	private List<List<String>> predicatesAnd = new ArrayList<List<String>>();
	private List<List<String>> predicatesOr = new ArrayList<List<String>>();
	private final ParametrosWebWhereAnd parametrosWebWhereAnd = new ParametrosWebWhereAnd();
	private final ParametrosWebWhereOr parametrosWebWhereOr = new ParametrosWebWhereOr();
	
	public List<ParametrosWeb> getParametrosWebAnd() {
		return Collections.unmodifiableList(parametrosWebAnd);
	}
	public List<ParametrosWeb> getParametrosWebOr() {
		return Collections.unmodifiableList(parametrosWebOr);
	}
	public List<List<String>> getPredicatesAnd() {
		return Collections.unmodifiableList(predicatesAnd);
	}
	public List<List<String>> getPredicatesOr() {
		return Collections.unmodifiableList(predicatesOr);
	}
	public ParametrosWebWhereAnd getParametrosWebWhereAnd() {
		return parametrosWebWhereAnd;
	}
	public ParametrosWebWhereOr getParametrosWebWhereOr() {
		return parametrosWebWhereOr;
	}
	
	@Override
	public String build(List<ParametrosWeb> parametrosWeb) {
		// TODO Auto-generated method stub
		setCamposParametros(parametrosWeb);
		setParametrosWeb(parametrosWeb);
		if (!getPredicatesAnd().isEmpty())
			getSql().append(getParametrosWebWhereAnd().build(getClazz(), getParametrosWebAnd(), getPredicatesAnd()));
		if (!getPredicatesOr().isEmpty())
			getSql().append(getParametrosWebWhereOr().build(getClazz(), getParametrosWebOr(), getPredicatesOr()));
		if (!getPredicatesAnd().isEmpty() && !getPredicatesOr().isEmpty())
			setSql(getSql().toString().replace("where (", "and ("));
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
	
	private void setParametrosWeb(List<ParametrosWeb> parametrosWeb) {
		parametrosWeb.forEach(parametro -> {
			if (parametro.getJuncao().equals("and"))
				this.parametrosWebAnd.add(parametro);
			else
				this.parametrosWebOr.add(parametro);
		});
	}
	
}
