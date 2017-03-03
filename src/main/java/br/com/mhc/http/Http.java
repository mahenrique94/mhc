package br.com.mhc.http;

import java.io.IOException;
import java.util.Scanner;

public class Http {

	public String request(final String target) {
		StringBuilder sb = new StringBuilder();
		try {
			Scanner scanner = new Scanner(new HttpResponse().get(new HttpConnect().connect(target)), "ISO-8859-1");
			while (scanner.hasNext()) {
				sb.append(scanner.nextLine());
				sb.append(System.lineSeparator());
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Não foi possível obter resposta da requisição");
		} catch (IOException e) {
			
		}
		return sb.toString();
	}
	
}
