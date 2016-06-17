package br.com.mhc.parametrosweb;

import java.util.List;


public class ParametrosWebFrom implements ParametrosWebSQL {

	private StringBuilder sql = new StringBuilder("select ");
	private Parametros parametros = new Parametros();
	private Class<?> clazz;
	
	public StringBuilder getSql() {
		return sql;
	}
	public Parametros getParametros() {
		return parametros;
	}
	public Class<?> getClazz() {
		return clazz;
	}
	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}
	
	public ParametrosWebFrom from(Class<?> clazz) {
		setClazz(clazz);
		return this;
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
