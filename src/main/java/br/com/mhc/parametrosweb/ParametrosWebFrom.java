package br.com.mhc.parametrosweb;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class ParametrosWebFrom {

	private static Root<?> root;
	
	public static Root<?> getRoot() {
		return root;
	}
	public static void setRoot(Root<?> root) {
		ParametrosWebFrom.root = root;
	}
	
	public static CriteriaQuery<?> build(CriteriaBuilder criteriaBuilder, Class clazz) {
		// TODO Auto-generated method stub
		CriteriaQuery<?> query = criteriaBuilder.createQuery(clazz);
		setRoot(query.from(clazz));
		return query;
	}

}
