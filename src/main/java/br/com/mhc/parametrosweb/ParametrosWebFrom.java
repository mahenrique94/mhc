package br.com.mhc.parametrosweb;

import java.util.List;


public class ParametrosWebFrom extends ParametrosWebSQLDefault {
	
	public ParametrosWebFrom() {
		// TODO Auto-generated constructor stub
		getSql().append("select ");
	}

	@Override
	public String build(List<ParametrosWeb> parametrosWeb) {
		// TODO Auto-generated method stub
		return getSql().append(getParametros().getAlias())
					   .append(getParametros().getSeparador())
					   .append(getFrom())
					   .append(getParametros().getSeparador())
					   .append(getParametros().getAlias())
					   .toString();
	}
	
	private String getFrom() {
		return getParametros().getFrom() + getClazz().getSimpleName();
	}

}
