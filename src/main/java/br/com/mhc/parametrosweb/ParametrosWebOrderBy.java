package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.List;

public class ParametrosWebOrderBy extends ParametrosWebSQLDefault {

	public ParametrosWebOrderBy() {
		// TODO Auto-generated constructor stub
		getSql().append(" order by");
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
