package br.com.mhc.parametrosweb;

import java.lang.reflect.Field;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class ParametrosWebPredicateLike implements ParametrosWebPredicate {

	@Override
	public Predicate build(CriteriaBuilder criteriaBuilder, Root<?> root, Object obj, String field) {
		// TODO Auto-generated method stub
		ParametrosWebPath parametrosWebPath = ParametrosWebPathFactory.find("String");
		String parametro = null;
		try {
			Field objField = obj.getClass().getDeclaredField(field);
			objField.setAccessible(true);
			try {
				parametro = objField.get(obj).toString();
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return criteriaBuilder.like(parametrosWebPath.criaPath(root, field), "%" + parametro + "%");
	}

}
