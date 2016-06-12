package br.com.mhc.parametrosweb;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.mhc.model.Pessoa;

public class ParametrosWebQuery {

	public static CriteriaQuery<?> create(ParametrosWeb parametrosWeb, CriteriaBuilder criteriaBuilder, Class<?> clazz) {
		CriteriaQuery<?> query = ParametrosWebFrom.build(criteriaBuilder, (Class) clazz);
		query = ParametrosWebWhere.build(parametrosWeb, criteriaBuilder, query, ParametrosWebFrom.getRoot());
		return query;
	}
	
}
