package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class ParametrosWebWhere {

	public static CriteriaQuery<?> build(ParametrosWeb parametrosWeb, CriteriaBuilder criteriaBuilder, CriteriaQuery<?> query, Root<?> root) {
		if (parametrosWeb.getHashMapWhere() != null && !parametrosWeb.getHashMapWhere().isEmpty()) {
			List<Predicate> predicates = new ArrayList<Predicate>();
			for (int i = 0; i < parametrosWeb.getHashMapWhere().size(); i++) {
				ParametrosWebPredicate parametrosWebPredicate = ParametrosWebPredicateFactory.find(parametrosWeb.getHashMapWhere().get(parametrosWeb.getParametros().get(i)));
				predicates.add(parametrosWebPredicate.build(criteriaBuilder, root, parametrosWeb.getObj(), parametrosWeb.getParametros().get(i)));
			}
			query.where((Predicate[]) predicates.toArray(new Predicate[0]));
		}
		return query;
	}
	
}
