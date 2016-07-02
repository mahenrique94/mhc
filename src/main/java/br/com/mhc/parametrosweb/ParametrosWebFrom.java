package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ParametrosWebFrom implements ParametrosWebSQL {

	@Override
	public Collection build(Object... parametros) {
		// TODO Auto-generated method stub
		Collection<Object> from = new ArrayList<Object>();
		from.add(select());
		from.add(alias());
		from.add(from());
		from.add(table((Class<?>) parametros[0]));
		from.add(alias());
		from.addAll(new ParametrosWebWhere().build(parametros[0], parametros[1]));
		return from;
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
