package br.com.mhc.parametrosweb;

public class ParametrosWebQuery {

	private String from;
	private String where;
	private String orderBy;
	private Integer limit;
	
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
		return orderBy != null ? orderBy : " order by a.id";
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public Integer getLimit() {
		return limit != null ? limit : 100;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
	public String build() {
		StringBuilder query = new StringBuilder();
		if (getFrom() != null)
			query.append(getFrom());
		if (getWhere() != null)
			query.append(getWhere());
		if (getOrderBy() != null)
			query.append(getOrderBy());
		return query.toString();
	}
}
