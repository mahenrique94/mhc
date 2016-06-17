package br.com.mhc.parametrosweb;

public class ParametrosWebQuery {

	private String from;
	private String where;
	private String orderBy;
	private String limit;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	
	public String build() {
		return getFrom().concat(getWhere()).concat(getOrderBy());
	}
}
