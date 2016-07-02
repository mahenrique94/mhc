package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParametrosWebTarefa {

	List<ParametrosWebSQL> tarefas = new ArrayList<ParametrosWebSQL>();
	
	public void adiciona(ParametrosWebSQL tarefa) {
		this.tarefas.add(tarefa);
	}
	
	public List<ParametrosWebSQL> get() {
		return Collections.unmodifiableList(this.tarefas);
	}
	
}
