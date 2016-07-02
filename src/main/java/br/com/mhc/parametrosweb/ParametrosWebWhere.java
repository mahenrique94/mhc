package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.com.mhc.function.ClassFunction;

public class ParametrosWebWhere implements ParametrosWebSQL {

	private List<List<String>> parametrosAnd = new ArrayList<List<String>>();
	private List<List<String>> parametrosOr = new ArrayList<List<String>>();
	private Class<?> clazz;
	
	@Override
	public Collection build(Object... parametros) {
		// TODO Auto-generated method stub
		Collection<Object> where = new ArrayList<Object>();
		this.clazz = (Class) parametros[0];
		List<ParametrosWeb> parametrosWeb = (List<ParametrosWeb>) parametros[1];
		if (new ParametrosWebValidator().validaWhere(parametrosWeb.get(0).getCampo(), parametrosWeb.get(0).getParametroInicial())) {
			where.add(where());
			where.addAll(executeWhere(parametrosWeb));
		}
		where.addAll(new ParametrosWebOrderBy().build(parametrosWeb));
		return where;
	}
	
	private Collection<String> executeWhere(List<ParametrosWeb> parametrosWeb) {
		ArrayList<String> parametros = new ArrayList<String>();
		pegaParametros(parametrosWeb);
		parametros.addAll(criaWhere(this.parametrosAnd, this.parametrosOr));
		return parametros;
	}
	
	private Collection criaWhere(List<List<String>> parametrosAnd, List<List<String>> parametrosOr) {
		// TODO Auto-generated method stub
		ArrayList<String> parametros = new ArrayList<String>();
		if (parametrosAnd != null && !parametrosAnd.isEmpty())
			parametros.addAll(new ParametrosWebWhereAnd().build("and", parametrosAnd, (parametrosOr != null && !parametrosOr.isEmpty())));
		if (parametrosOr != null && !parametrosOr.isEmpty())
			parametros.addAll(new ParametrosWebWhereOr().build("or", parametrosOr));
		return parametros;
	}

	private void pegaParametros(List<ParametrosWeb> parametrosWeb) {
		parametrosWeb.forEach(parametro -> {
			List<String> predicate = new ArrayList<String>();
			predicate.add(parametro.getCampo());
			try {
				predicate.add(ClassFunction.getTypeAttribute(this.clazz, parametro.getCampo()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new ParametrosWebExpection("Não foi possível obter o tipo do campo: " + parametro.getCampo());
			}
			predicate.add(parametro.getParametroInicial());
			predicate.add(parametro.getParametroFinal());
			predicate.add(parametro.getOperador());
			if (parametro.getJuncao() != null && parametro.getJuncao().equals("or"))
				this.parametrosOr.add(predicate);
			else
				this.parametrosAnd.add(predicate);	
		});
	}
	
	private String where() {
		return "where";
	}
	
}
