package br.com.mhc.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		fila.add("Matheus");
		fila.add("João");
		fila.add("Pedro");
		System.out.println(fila.toString());
		
		fila.remove();
		System.out.println(fila.toString());
		
		fila.remove();
		System.out.println(fila.toString());
	}
	
}
