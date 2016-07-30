package br.com.mhc.parametrosweb;

import java.util.Queue;

/** @auth Matheus Castiglioni
 *  Classe responsável por pegar todos os elementos contidos no Queue e devolver a SQL final
 */
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
