package br.com.mhc.parametrosweb;

import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

public class ParametrosWebPathString implements ParametrosWebPath {

	@Override
	public Expression<String> criaPath(Root<?> root, String field) {
		// TODO Auto-generated method stub
		return root.<String> get(field);
	}
	
}
