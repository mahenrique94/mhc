package br.com.mhc.parametrosweb;

/** @auth Matheus Castiglioni
 *  Classe responsável por transformar minhas tarefas em runnable, para que as tarefas possam ser executadas em
 *  threads diferentes
 *  Ex: tarefa1 = Uma thread
 *  	tarefa2 = Outra thread
 *  	tarefa3 = Outra thread
 *  	...
 */
public interface ParametrosWebSQL extends Runnable {

	void build();
	
}
