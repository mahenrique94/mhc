package br.com.mhc.collection;

import java.util.ArrayList;

public class ArrayGenerico {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Suzana");
		
		list.add(nomes);
		list.add("Matheus");
		System.out.println(list.toString());
	}
	
}
