package br.com.mhc.parametrosweb;

import java.util.Queue;

public class ParametrosWebFactory {

	public String create(Queue<Object> atributos) {
		StringBuilder SQL = new StringBuilder();
		while (atributos.iterator().hasNext()) {
			SQL.append(atributos.poll());
			SQL.append(" ");
		}
		return SQL.toString().replaceAll("[,\\s]+$", "");
	}
	
}
