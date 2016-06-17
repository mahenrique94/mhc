package br.com.mhc.parametrosweb;

import java.util.List;

import br.com.mhc.function.ClassFunction;

public class ParametrosWebWhereOr implements ParametrosWebWhereSQL {

	private StringBuilder sql = new StringBuilder();
	private final Parametros parametros = new Parametros();
	
	public StringBuilder getSql() {
		return sql;
	}
	public Parametros getParametros() {
		return parametros;
	}

	@Override
	public String build(Class<?> clazz, List<ParametrosWeb> parametrosWeb, List<List<String>> predicates) {
		// TODO Auto-generated method stub
		getSql().append("(");
		for(int i = 0; i < predicates.size(); i++) {
			List<String> predicate = predicates.get(i);
			Operador operador = null;
			String type = null;
			try {
				type = ClassFunction.getTypeAttribute(clazz, predicate.get(0));
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
			if (i == (predicates.size() - 1))
				break;
			getSql().append(getParametros().getSeparador())
					.append("or")
					.append(getParametros().getSeparador());
		}
		return getSql().append(")").toString();
	}
}
