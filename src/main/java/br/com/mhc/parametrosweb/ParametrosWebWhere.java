package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.mhc.function.ClassFunction;

public class ParametrosWebWhere implements ParametrosWebSQL {

	private StringBuilder sql = new StringBuilder(" where ");
	private Parametros parametros = new Parametros();
	private List<List<String>> predicates = new ArrayList<List<String>>();
	private Class<?> clazz;
	
	public StringBuilder getSql() {
		return sql;
	}
	public Parametros getParametros() {
		return parametros;
	}
	public List<List<String>> getPredicates() {
		return Collections.unmodifiableList(predicates);
	}
	public Class<?> getClazz() {
		return clazz;
	}
	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}
	
	public ParametrosWebWhere from(Class<?> clazz) {
		setClazz(clazz);
		return this;
	}
	
	@Override
	public String build(List<ParametrosWeb> parametrosWeb) {
		// TODO Auto-generated method stub
		setCamposParametros(parametrosWeb);
		for(int i = 0; i < getPredicates().size(); i++) {
			List<String> predicate = getPredicates().get(i);
			Operador operador = null;
			String type = null;
			try {
				type = ClassFunction.getTypeAttribute(getClazz(), predicate.get(0));
				operador = OperadorFactory.create(type, predicate.get(2));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("Não foi possível pegar o operador para o parâmetro: " + predicate.get(0));
			}
			getSql().append(getParametros().getAlias())
					.append(getParametros().getJuntador())
					.append(predicate.get(0))
					.append(getParametros().getSeparador())
					.append(parametrosWeb.get(i).getOperador() != null ? operador.get(predicate, parametrosWeb.get(i).getOperador(), type) : operador.get(predicate));
			if (i == (parametrosWeb.size() - 1))
				break;
			getSql().append(getParametros().getSeparador())
					.append(parametrosWeb.get(i).getJuncao())
					.append(getParametros().getSeparador());
		}
		return getSql().toString();
	}
	
	private void setCamposParametros(List<ParametrosWeb> parametrosWeb) {
		parametrosWeb.forEach(parametro -> {
			List<String> predicate = new ArrayList<String>();
			predicate.add(parametro.getCampo());
			predicate.add(parametro.getParametroInicial());
			predicate.add(parametro.getParametroFinal());
			this.predicates.add(predicate);
		});
	}

}
