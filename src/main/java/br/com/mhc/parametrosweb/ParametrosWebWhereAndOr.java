package br.com.mhc.parametrosweb;

import java.util.List;

import br.com.mhc.function.ClassFunction;

public class ParametrosWebWhereAndOr extends ParametrosWebWhereDefault {

	@Override
	public String build(Class<?> clazz, List<ParametrosWeb> parametrosWeb, List<List<String>> predicates) {
		// TODO Auto-generated method stub
		for(int i = 0; i < predicates.size(); i++) {
			List<String> predicate = predicates.get(i);
			if (super.isInvalid(predicate)) {
				continue;
			}
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
					.append(parametrosWeb.get(i).getOperador() != null ? operador.get(predicate, parametrosWeb.get(i).getOperador(), type) : operador.get(predicate))
					.append(getParametros().getSeparador())
					.append("and")
					.append(getParametros().getSeparador());
		}
		return getSql().toString();
	}
}
