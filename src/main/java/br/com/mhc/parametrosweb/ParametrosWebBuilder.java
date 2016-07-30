package br.com.mhc.parametrosweb;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/** @auth Matheus Castiglioni
 *  Classe responsável por iniciar todo o processo de criação da SQL, somente ela será visível publicamente para os
 *  métodos em projetos
 */
public class ParametrosWebBuilder {
	
	private List<ParametrosWeb> parametrosWeb;
	private Queue<Object> atributos = new ArrayBlockingQueue(100);

	public void init(Class<?> clazz) {
		ParametrosWebGerenciadorTarefas gerenciador = new ParametrosWebGerenciadorTarefas(this.atributos, clazz, this.parametrosWeb);
		gerenciador.execute();
	}
	
	public String createQuery(Class<?> clazz, List<ParametrosWeb> parametrosWeb) {
		this.parametrosWeb = parametrosWeb;
		if (new ParametrosWebValidator().validaFrom(clazz))
			init(clazz);
		return new ParametrosWebFactory().create(this.atributos);
	}
	
}
