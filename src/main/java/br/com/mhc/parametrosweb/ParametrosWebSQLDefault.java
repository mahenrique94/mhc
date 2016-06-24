package br.com.mhc.parametrosweb;

public abstract class ParametrosWebSQLDefault implements ParametrosWebSQL {

	private StringBuilder sql = new StringBuilder();
	private final Parametros parametros = new Parametros();
	private Class<?> clazz;
	
	public void setSql(String sql) {
		this.sql = new StringBuilder(sql);
	}
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
	
	public ParametrosWebSQLDefault from(Class<?> clazz) {
		setClazz(clazz);
		return this;
	}
	
}
