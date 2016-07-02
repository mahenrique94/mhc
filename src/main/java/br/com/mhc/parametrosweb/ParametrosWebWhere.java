package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

import br.com.mhc.function.ClassFunction;

public class ParametrosWebWhere implements ParametrosWebSQL {

	private List<List<String>> parametrosAnd = new ArrayList<List<String>>();
	private List<List<String>> parametrosOr = new ArrayList<List<String>>();
	private Class<?> clazz;
	private Queue<Object> atributos;
	private final Object[] parametros;
	
	public ParametrosWebWhere(Queue<Object> atributos, Object... parametros) {
		// TODO Auto-generated constructor stub
		this.atributos = atributos;
		this.parametros = parametros;
	}
	
	@Override
	public void build() {
		// TODO Auto-generated method stub
		Collection<Object> where = new ArrayList<Object>();
		this.clazz = (Class) this.parametros[0]; // 0 = Class
		List<ParametrosWeb> parametrosWeb = (List<ParametrosWeb>) this.parametros[1]; // 1 = List<ParametrosWeb>
		if (new ParametrosWebValidator().validaWhere(parametrosWeb.get(0).getCampo(), parametrosWeb.get(0).getParametroInicial())) {
			where.add(where());
			where.addAll(executeWhere(parametrosWeb));
		}
		this.atributos.addAll(where);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		build();
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
