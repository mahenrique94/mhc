package br.com.mhc.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class TestaEmail {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");  
		prop.put("mail.smtp.auth", "true");  
		prop.put("mail.debug", "true");  
		prop.put("mail.smtp.port", 465);  
		prop.put("mail.smtp.socketFactory.port", 465);  
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.ssl.enable", "true");
		prop.put("mail.transport.protocol", "smtp");
		
		Session emailSession = Session.getInstance(prop, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("matheushcastiglioni@gmail.com", "mahmah94");
			} 
		});
		
		try {
			Transport transport = emailSession.getTransport();
			MimeMessage message = new MimeMessage(emailSession);
			message.setSubject("Teste");
			message.setFrom(new InternetAddress("matheushcastiglioni@gmail.com"));
			message.addRecipients(Message.RecipientType.TO, InternetAddress.parse("matheushcastiglioni@gmail.com"));
			message.setContent("<h1>Descrição</h1>", "text/html;charset=UTF-8");
			transport.connect();
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
