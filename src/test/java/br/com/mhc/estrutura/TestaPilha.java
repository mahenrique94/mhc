package br.com.mhc.estrutura;

public class TestaPilha {

	public static void main(String[] args) {
		Pilha<String> pilha = new Pilha();
		pilha.push("Matheus");
		pilha.push("Henrique");
		pilha.push("Castiglioni");
		System.out.println(pilha);
		
		pilha.remove();
		System.out.println(pilha);
		
		String s1 = pilha.peek();
		System.out.println(s1);
		System.out.println(pilha);
		
		String s2 = pilha.pop();
		System.out.println(s2);
		System.out.println(pilha);
	}
	
}
