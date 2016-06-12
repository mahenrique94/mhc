package br.com.mhc.email;


public class Email {

	private String from;
	private String to;
	private String subject;
	private String message;
	
	public Email(String from, String to, String subject, String message) {
		// TODO Auto-generated constructor stub
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.message = message;
	}
	public Email() {
		// TODO Auto-generated constructor stub
	}

	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
