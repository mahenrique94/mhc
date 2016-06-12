package br.com.mhc.parametrosweb;

public class ParametrosWebPredicateFactory {

	public static ParametrosWebPredicate find(String operador) {
		ParametrosWebPredicate parametrosWebPredicate = null;
		if (operador.equals("like"))
				parametrosWebPredicate = new ParametrosWebPredicateLike();
		return parametrosWebPredicate;
	}
	
}
