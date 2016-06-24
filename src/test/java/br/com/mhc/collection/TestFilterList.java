package br.com.mhc.collection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.mhc.model.Pessoa;

public class TestFilterList {
	
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(1, "João", 30, "M", Calendar.getInstance()));
		pessoas.add(new Pessoa(2, "Matheus", 21, "M", Calendar.getInstance()));
		pessoas.add(new Pessoa(3, "Maria", 18, "F", Calendar.getInstance()));
		
		Pessoa matheus = new Pessoa(4, "Matheus", 21, "M", Calendar.getInstance());
		
		int indexMatheus = pessoas.indexOf(matheus);
		System.out.println(indexMatheus);
		System.out.println(pessoas.get(indexMatheus).getNome());
	}
	
}
