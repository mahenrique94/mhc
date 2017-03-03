package br.com.mhc.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestaStream {

	public static void main(String[] args) {
		List<String> alunos = new ArrayList<String>();
		alunos.addAll(Arrays.asList("Matheus", "Joao", "Luis", "Fernando", "Fabiano"));
		
		alunos.stream()
			  .sorted((s1, s2) -> s1.compareTo(s2))
			  .filter(s -> s.length() > 5)
			  .collect(Collectors.toList())
			  .forEach(System.out::println);
	}
	
	public static String novaLista() {
		return "Não acei o filtro";
	}
	
}
