package br.com.mhc.java8;

import java.util.Arrays;
import java.util.List;

public class TestaComparator {
	
	public static void main(String[] args) {
		List<String> alunos = Arrays.asList("Matheus", "João", "Fernado", "Fabiano", "Luis");
		alunos.stream()
			.sorted((s1, s2) -> s1.compareTo(s2))
			.filter(s -> s.length() > 10)
			.forEach(System.out::println);
	}

}
