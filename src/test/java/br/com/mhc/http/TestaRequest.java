package br.com.mhc.http;

public class TestaRequest {

	public static void main(String[] args) {
		System.out.println(new Http().request("http://localhost:8080/sac/email/atendimento"));
	}
	
}
