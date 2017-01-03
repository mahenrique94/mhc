package br.com.mhc.email;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.com.mhc.function.StringFunction;

public class EmailBuilder {

	private Email email = new Email();
	private File file;
	
	public Email getEmail() {
		return email;
	}
	public File getFile() {
		return file;
	}
	
	public EmailBuilder(File file) {
		// TODO Auto-generated constructor stub
		this.file = file;
	}
	
	public EmailBuilder from(String from) {
		getEmail().setFrom(from);
		return this;
	}
	
	public EmailBuilder to(String to) {
		getEmail().setTo(StringFunction.trimAll(to).split(","));
		return this;
	}
	
	public EmailBuilder withSubject(String subject) {
		getEmail().setSubject(subject);
		return this;
	}
	
	public EmailBuilder withMessage(String message) {
		getEmail().setMessage(message);
		return this;
	}
	
	public void send() {
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(getFile()));
			Session session = Session.getInstance(prop, new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(prop.getProperty("mail.account"), prop.getProperty("mail.password"));
				}
			});
			Transport transport = session.getTransport();
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(getEmail().getFrom()));
			message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(getEmail().getTo()[0]));
			message.setSubject(getEmail().getSubject());
			message.setContent(getEmail().getMessage(), "text/html;charset=UTF-8");
			transport.connect();
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
}
