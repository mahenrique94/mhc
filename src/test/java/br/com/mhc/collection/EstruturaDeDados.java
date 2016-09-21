package br.com.mhc.collection;

import java.util.Stack;

public class EstruturaDeDados {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		pilha.add("Matheus");
		pilha.add("Henrique");
		pilha.add("Castiglioni");
		System.out.println(pilha);
		
		String s1 = pilha.peek();
		System.out.println(s1);
		System.out.println(pilha);
		
		String s2 = pilha.pop();
		System.out.println(s2);
		System.out.println(pilha);
		
		pilha.push("MHC");
		System.out.println(pilha);
	}
	
}
