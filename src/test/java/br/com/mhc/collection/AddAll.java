package br.com.mhc.collection;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Matheus");
		nomes.add("Henrique");
		nomes.add("Castiglioni");
		System.out.println(nomes.toString());
		list.addAll(nomes);
		list.add("João");
		System.out.println(list.toString());
	}
	
}
