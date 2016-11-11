package br.com.mhc.interfacee;

import java.util.Calendar;

public class TestaLog {

	public static void main(String[] args) {
		Post post = new Post("Matheus", "Teste", Calendar.getInstance());
		
		if (post instanceof Log)
			System.out.println("Implementa");
	}
	
}
