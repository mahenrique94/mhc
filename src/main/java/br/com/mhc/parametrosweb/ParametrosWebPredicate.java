package br.com.mhc.parametrosweb;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public interface ParametrosWebPredicate {

	Predicate build(CriteriaBuilder criteriaBuilder, Root<?> root, Object obj, String field);
	
}
