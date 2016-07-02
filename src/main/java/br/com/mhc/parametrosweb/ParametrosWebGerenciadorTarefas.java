package br.com.mhc.parametrosweb;

import java.util.List;
import java.util.Queue;

public class ParametrosWebGerenciadorTarefas {

	private Queue<Object> atributos;
	private Class<?> clazz;
	private List<ParametrosWeb> parametrosWeb;

	public ParametrosWebGerenciadorTarefas(Queue<Object> atributos, Class<?> clazz, List<ParametrosWeb> parametrosWeb) {
		// TODO Auto-generated constructor stub
		this.atributos = atributos;
		this.clazz = clazz;
		this.parametrosWeb = parametrosWeb;
	}
	
	public void execute() {
		ParametrosWebTarefa tarefas = new ParametrosWebTarefa();
		tarefas.adiciona(new ParametrosWebFrom(this.atributos, this.clazz, this.parametrosWeb));
		tarefas.adiciona(new ParametrosWebWhere(this.atributos, this.clazz, this.parametrosWeb));
		tarefas.adiciona(new ParametrosWebOrderBy(this.atributos, this.parametrosWeb));
		for (ParametrosWebSQL tarefa : tarefas.get()) {
			Thread t = new Thread(tarefa);
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
