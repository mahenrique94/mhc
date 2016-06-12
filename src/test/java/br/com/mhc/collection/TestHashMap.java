package br.com.mhc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestHashMap {

//	public static void main(String[] args) {
//		String emailChamado = "chamado@email.com;matheus@email.com;carol@email.com";
//		String emailCobranda = "cobranca@email.com;financeiro@email.com;carol@email.com";
//		HashMap<String, String> emails = new HashMap<String, String>();
//		emails.put("CTE", emailChamado);
//		emails.put("COBRANCA", emailCobranda);
//		System.out.println(emails.get("CTE"));
//		System.out.println(emails.get("COBRANCA"));
//	}
	
	public static void main(String[] args) {
		HashMap<String, String> arquivos = new HashMap<String, String>();
		ArrayList<String> array = new ArrayList<String>();
		arquivos.put("TESTE", "100, 50");
		String valores = arquivos.get("TESTE");
		if (valores != null) {
			String[] valor = valores.split(",");
			for (String string : valor) {
				array.add(string);
			}
		}
		for (int i = 0; i <= 10; i++) {
			array.add(Integer.toString(i));
		}
		arquivos.put("TESTE", array.toString());
		System.out.println(arquivos.get("TESTE"));
	}
	
}
