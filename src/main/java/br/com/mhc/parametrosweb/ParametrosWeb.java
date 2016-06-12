package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import br.com.mhc.function.StringFunction;


public class ParametrosWeb {

	private Object obj;
	private Class clazz;
	private ArrayList<String> where = new ArrayList<String>();
	private ArrayList<String> parametros = new ArrayList<String>();
	private String orderBy;
	private Integer limit;
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Class<?> getClazz() {
		return clazz;
	}
	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}
	public ArrayList<String> getWhere() {
		return where;
	}
	public void setWhere(ArrayList<String> where) {
		this.where = where;
	}
	public ArrayList<String> getParametros() {
		return parametros;
	}
	public void setParametros(ArrayList<String> parametros) {
		this.parametros = parametros;
	}
	public String getOrderBy() {
		return orderBy != null ? orderBy : "id";
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
	
	public HashMap<String, String> getHashMapWhere() {
		HashMap<String, String> hashMapWhere = new HashMap<String, String>();
		getWhere().forEach(where -> {
			where = StringFunction.trimAll(where);
			hashMapWhere.put(where.toString().substring(0, where.toString().indexOf(":")), where.toString().substring(where.toString().indexOf(":") + 1));
		});
		return hashMapWhere;
	}

}
