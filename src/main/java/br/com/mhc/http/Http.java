package br.com.mhc.http;

import java.util.Scanner;

public class Http {

	public String request(final String target) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(new HttpResponse().get(new HttpConnect().connect(target)), "ISO-8859-1");
		while (scanner.hasNext()) {
			sb.append(scanner.nextLine());
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}
	
}
