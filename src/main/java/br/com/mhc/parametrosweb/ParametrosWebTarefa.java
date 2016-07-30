package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** @auth Matheus Castiglioni
 *  Classe responsável por agrupar todas as tarefas que serão executadas para conseguir obter a SQL final
 *  Ex: tarefa1 = Buscar Tabela
 *  	tarefa2 = Buscar Where
 *  	tarefa3 = Buscar Order By
 *  	...
 */
public class ParametrosWebTarefa {

	List<ParametrosWebSQL> tarefas = new ArrayList<ParametrosWebSQL>();
	
	public void adiciona(ParametrosWebSQL tarefa) {
		this.tarefas.add(tarefa);
	}
	
	public List<ParametrosWebSQL> get() {
		return Collections.unmodifiableList(this.tarefas);
	}
	
}
