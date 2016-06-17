package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.List;

public class ParametrosWebOrderBy implements ParametrosWebSQL {

	private StringBuilder sql = new StringBuilder(" order by");
	
	public StringBuilder getSql() {
		return sql;
	}
	
	@Override
	public String build(List<ParametrosWeb> parametrosWeb) {
		// TODO Auto-generated method stub
		List<String> orderBy = new ArrayList<String>();
		for(ParametrosWeb parametro : parametrosWeb) {
			if (!orderBy.contains(" a." + parametro.getOrderBy()))
				orderBy.add(" a." + parametro.getOrderBy());
		}
		orderBy.forEach(order -> getSql().append(order).append(","));
		return getSql().toString().substring(0, getSql().lastIndexOf(","));
	}

}
