package br.com.mhc.email;

import br.com.mhc.email.EmailBuilder;


public class SendEmail {

	public static void main(String[] args) {
		EmailBuilder emailBuilder = new EmailBuilder();
		emailBuilder.from("matheus_mhc@hotmail.com")
			   .to("matheushcastiglioni@gmail.com")
			   .subject("Testando javamail")
			   .message("Enviando email com java")
			   .send();
	}
	
}
