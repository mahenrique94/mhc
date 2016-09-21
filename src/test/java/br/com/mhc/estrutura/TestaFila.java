package br.com.mhc.estrutura;

public class TestaFila {

	public static void main(String[] args) {
		Fila<String> fila = new Fila<String>();
		
		fila.push("Matheus");
		fila.push("Henrique");
		fila.push("Castiglioni");
		System.out.println(fila);
		
		fila.remove();
		System.out.println(fila);
		
		String s1 = fila.peek();
		System.out.println(s1);
		System.out.println(fila);
		
		String s2 = fila.pop();
		System.out.println(s2);
		System.out.println(fila);
	}
	
}
