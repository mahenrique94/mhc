package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ParametrosWebOrderBy implements ParametrosWebSQL {

	@Override
	public Collection build(Object... parametros) {
		// TODO Auto-generated method stub
		Collection<Object> orderBy = new ArrayList<Object>();
		List<ParametrosWeb> parametrosWeb = (List<ParametrosWeb>) parametros[0];
		int qtdOrderBy = 0;
		orderBy.add(orderBy());
		if (new ParametrosWebValidator().validaOrderBy(parametrosWeb.get(0).getCampo())) {
			for (int i = 0; i < parametrosWeb.size(); i++) {
				if (qtdOrderBy > 0)
					orderBy.add(",");
				if (parametrosWeb.get(i).getOrderBy() != null) {
					if (!orderBy.contains(campo(parametrosWeb.get(i).getOrderBy()))) {
						orderBy.add(campo(parametrosWeb.get(i).getOrderBy()));
						qtdOrderBy++;
					}
				} else {
					if (!orderBy.contains(campo("id"))) {
						orderBy.add(campo("id"));
						qtdOrderBy++;
					}
				}
			}
		} else {
			orderBy.add(campo("id"));
		}
		return orderBy;
	}
	
	private String alias() {
		return "a.";
	}
	
	private String campo(String campo) {
		return alias().concat(campo);
	}
	
	private String orderBy() {
		return "order by";
	}
	
	private boolean ultimoParametro(int atual, int total) {
		// Adicionado + 1 no atual pois os parâmetros estão vindo de um for,
		// onde: atual começa em 0 e total começa em 1
		return (atual + 1) == total;
	}

}
