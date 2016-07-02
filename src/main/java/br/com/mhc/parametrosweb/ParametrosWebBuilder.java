package br.com.mhc.parametrosweb;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ParametrosWebBuilder {
	
	private List<ParametrosWeb> parametrosWeb;
	private Queue<Object> atributos = new LinkedList<Object>();

	public void from(Class<?> clazz) {
		this.atributos.addAll(new ParametrosWebFrom().build(clazz, this.parametrosWeb));
	}
	
	public String createQuery(Class<?> clazz, List<ParametrosWeb> parametrosWeb) {
		this.parametrosWeb = parametrosWeb;
		if (new ParametrosWebValidator().validaFrom(clazz))
			from(clazz);
		return new ParametrosWebFactory().create(this.atributos);
	}
	
}
