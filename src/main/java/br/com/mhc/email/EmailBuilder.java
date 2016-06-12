package br.com.mhc.email;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/** @auth matheus
 *  http://www.devmedia.com.br/enviando-email-com-javamail-utilizando-gmail/18034
 */
public class EmailBuilder {

	private final Properties properties = new Properties();
	private Email email = new Email();
	private Message message;
	
	public EmailBuilder from(String from) {
		getEmail().setFrom(from);
		return this;
	}
	
	public EmailBuilder to(String to) {
		getEmail().setTo(to);
		return this;
	}
	
	public EmailBuilder subject(String subject) {
		getEmail().setSubject(subject);
		return this;
	}
	
	public EmailBuilder message(String message) {
		getEmail().setMessage(message);
		return this;
	}
	
	public void send() {
		criaMessage(getSession(getProperties().getProperty("email"), getProperties().getProperty("password")), getEmail(), getAddress());
		try {
			Transport.send(this.message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
	private void criaMessage(Session session, Email email, Address[] to) {
		// TODO Auto-generated method stub
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(email.getFrom()));
			message.setRecipients(Message.RecipientType.TO, to);
			message.setSubject(email.getSubject());
			message.setText(email.getMessage());
			this.message = message;
		} catch (MessagingException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

	private Properties getProperties() {
		try {
			this.properties.load(new FileInputStream("email.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.properties;
	}
	
	private Session getSession(final String email, final String password) {
		Session session = Session.getDefaultInstance(getProperties(), new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(email, password);
			}
		});
		session.setDebug(true);
		return session;
	}
	
	private Address[] getAddress() {
		try {
			Address[] to = InternetAddress.parse(getEmail().getTo());
			return to;
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
				
	}
	
	private Email getEmail() {
		return email;
	}
	
}
