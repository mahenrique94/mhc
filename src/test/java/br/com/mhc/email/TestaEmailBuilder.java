package br.com.mhc.email;

import java.io.File;

public class TestaEmailBuilder {

	public static void main(String[] args) {
		EmailBuilder builder = new EmailBuilder(new File("email.properties"));
		builder.from("matheushcastiglioni@gmail.com")
			   .to("matheushcastiglioni@gmail.com")
			   .withSubject("Teste")
			   .withMessage("Teste")
			   .send();
	}
	
}
