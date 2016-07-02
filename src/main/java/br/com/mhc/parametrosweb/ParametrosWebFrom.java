package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public class ParametrosWebFrom implements ParametrosWebSQL {

	private Queue<Object> atributos;
	private final Object[] parametros;

	public ParametrosWebFrom(Queue<Object> atributos, Object... parametros) {
		// TODO Auto-generated constructor stub
		this.atributos = atributos;
		this.parametros = parametros;
	}
	
	@Override
	public void build() {
		// TODO Auto-generated method stub
		Collection<Object> from = new ArrayList<Object>();
		from.add(select());
		from.add(alias());
		from.add(from());
		from.add(table((Class<?>) this.parametros[0])); // 0 = Class
		from.add(alias());
		this.atributos.addAll(from);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		build();
	}
	
	private String select() {
		return "select";
	}
	
	private String alias() {
		return "a";
	}
	
	private String from() {
		return "from";
	}
	
	private String table(Class<?> clazz) {
		return clazz.getSimpleName();
	}

}
