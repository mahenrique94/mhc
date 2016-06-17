package br.com.mhc.parametrosweb;

import java.util.List;

public interface ParametrosWebWhereSQL {

	String build(Class<?> clazz, List<ParametrosWeb> parametrosWeb, List<List<String>> predicates);
	
}
