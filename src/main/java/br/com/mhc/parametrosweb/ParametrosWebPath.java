package br.com.mhc.parametrosweb;

import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

public interface ParametrosWebPath {

	Expression<String> criaPath(Root<?> root, String field);
	
}
