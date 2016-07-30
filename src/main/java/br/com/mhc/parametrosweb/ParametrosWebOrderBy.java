package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/** @auth Matheus Castiglioni
 *  Classe responsável por construir todos os campos que estarão no order by da SQL
 *  Ex: order by campo1, campo2, campo3 desc...
 */
public class ParametrosWebOrderBy implements ParametrosWebSQL {

	private Queue<Object> atributos;
	private final Object[] parametros;

	public ParametrosWebOrderBy(Queue<Object> atributos, Object... parametros) {
		// TODO Auto-generated constructor stub
		this.atributos = atributos;
		this.parametros = parametros;
	}
	
	@Override
	public void build() {
		// TODO Auto-generated method stub
		Collection<Object> orderBy = new ArrayList<Object>();
		List<ParametrosWeb> parametrosWeb = (List<ParametrosWeb>) parametros[0];
		boolean adicionaVirgula = false;
		try {
			if (new ParametrosWebValidator().validaOrderBy(parametrosWeb.get(0).getCampo())) {
				orderBy.add(orderBy());
				for (int i = 0; i < parametrosWeb.size(); i++) {
					if (parametrosWeb.get(i).getOrderBy() != null) {
						if (!orderBy.contains(campo(parametrosWeb.get(i).getOrderBy()))) {
							orderBy.add(campo(parametrosWeb.get(i).getOrderBy()));
							adicionaVirgula = true;
						}
					} else {
						if (!orderBy.contains(campo("id"))) {
							orderBy.add(campo("id"));
							adicionaVirgula = true;
						}
					}
					if (adicionaVirgula) {
						orderBy.add(",");
						adicionaVirgula = false;
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			orderBy.add(orderBy());
			orderBy.add(campo("id"));
		}
		this.atributos.addAll(orderBy);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		build();
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
