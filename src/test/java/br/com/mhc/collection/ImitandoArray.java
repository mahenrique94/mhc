package br.com.mhc.collection;

import java.util.Calendar;

import br.com.mhc.model.Pessoa;

public class ImitandoArray {
	
	public static Pessoa[] pessoas = new Pessoa[10];
	public static int posicaoLivre = 0;

	public static void main(String[] args) {
		adiciona(new Pessoa(1, "Matheus", 22, "M", Calendar.getInstance()));
		adiciona(new Pessoa(2, "Rodrigo", 20, "M", Calendar.getInstance()));
		adiciona(new Pessoa(3, "Maria", 30, "F", Calendar.getInstance()));
		mostra(pessoas);
		
		adiciona(new Pessoa(4, "Rosana", 45, "F", Calendar.getInstance()), 1);
		mostra(pessoas);
		
		adiciona(new Pessoa(5, "João", 30, "M", Calendar.getInstance()), 0);
		mostra(pessoas);
		
		System.out.println(contem("Matheus"));
		System.out.println();
		
		remove(1);
		mostra(pessoas);
		
		adiciona(new Pessoa(6, "Rodolfo", 28, "M", Calendar.getInstance()));
		mostra(pessoas);
		
		System.out.println(pega(1).getNome());
		System.out.println();
		
		System.out.println(contem("Matheus"));
		System.out.println();
	}
	
	public static void adiciona(Pessoa pessoa) {
		pessoas[posicaoLivre] = pessoa;
		posicaoLivre++;
	}
	
	public static void adiciona(Pessoa pessoa, int posicao) {
		for(int i = (posicaoLivre - 1); i >= posicao; i--) {
			pessoas[i + 1] = pessoas[i];
		}
		pessoas[posicao] = pessoa;
		posicaoLivre++;
	}
	
	public static boolean contem(String nome) {
		for(int i = 0; i < posicaoLivre; i++) {
			if (pessoas[i].getNome().equals(nome))
				return true;
		}
		return false;
	}
	
	public static void mostra(Pessoa[] pessoas) {
		for(int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] != null)
				System.out.println(pessoas[i].getNome());
			else
				System.out.println(pessoas[i]);
			
		}
		System.out.println();
	}
	
	public static Pessoa pega(int posicao) {
		return pessoas[posicao];
	}
	
	public static void remove(int posicao) {
		for (int i = posicao; i < posicaoLivre; i++) {
			pessoas[i] = pessoas[i + 1];
		}
		posicaoLivre--;
	}
	
}
