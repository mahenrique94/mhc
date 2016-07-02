package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class ParametrosWebWhereAndOr {

	protected final int posicaoAndOr = 0; // And oo Or
	protected final int posicaoPredicates = 1; // List<Listr<String>> referente aos parametrosAnd ou parametrosOr
	protected final int posicaoIsOr = 2; // True ou False
	
	public Collection build(Object... parametros) {
		// TODO Auto-generated method stub
		Collection<Object> where = new ArrayList<Object>();
		List<List<String>> predicates = (List<List<String>>) parametros[this.posicaoPredicates];
		for (int i = 0; i < predicates.size(); i++) {
			// 0 = Campo, 1 = Tipo, 2 = ParametroInicial, 3 = Parametro Final e 4 = Operador
			List<String> predicate = predicates.get(i);
			ParametrosWebOperador operador = ParametrosWebOperadorFactory.cria(predicate.get(4), predicate.get(1), predicate.get(3));
			where.addAll(operador.build(predicate.get(0), predicate.get(2), predicate.get(3)));
			if (!ultimoParametro(i, predicates.size()))
				where.add(juncao(parametros[this.posicaoAndOr]));
		}
		return where;
	}
	
	private String alias() {
		return "a.";
	}
	
	private String campo(String campo) {
		return alias().concat(campo);
	}
	
	private String juncao(Object andOr) {
		return andOr.toString();
	}

	private boolean ultimoParametro(int atual, int total) {
		// Adicionado + 1 no atual pois os parâmetros estão vindo de um for,
		// onde: atual começa em 0 e total começa em 1
		return (atual + 1) == total;
	}
	
}
