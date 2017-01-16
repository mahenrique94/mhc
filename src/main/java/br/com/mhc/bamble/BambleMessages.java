package br.com.mhc.bamble;

import java.io.IOException;

import javax.activation.DataHandler;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.InternetAddress;
import javax.mail.search.FlagTerm;

import com.ibm.icu.text.SimpleDateFormat;

public class BambleMessages {
	
	public static void readingMessages(Folder folder, boolean onlyUnread, String type, String path) {
		Message[] messages = findMessages(folder, onlyUnread);
		for(int i = 0; i < messages.length; i++) {
			try {
				BambleLog.log("LENDO EMAIL");
				BambleLog.info("Assunto", messages[i].getSubject());
				BambleLog.info("De", InternetAddress.toString(messages[i].getFrom()));
				BambleLog.info("Para", InternetAddress.toString(messages[i].getRecipients(Message.RecipientType.TO)));
				BambleLog.info("Data", new SimpleDateFormat("dd/MM/yyyy HH:mm").format(messages[i].getSentDate()));
				readMessage(messages[i], type, path);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static Message[] findMessages(Folder folder, boolean onlyUnread) {
		try {
			BambleLog.log("BUSCANDO EMAILS");
			if (onlyUnread)
				return folder.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));
			else
				return folder.getMessages();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private static void readMessage(Message message, String type, String path) {
		try {
			Object obj = message.getContent();
			if (obj instanceof Multipart) {
				Multipart mp = (Multipart) message.getContent();
				for(int i = 0; i < mp.getCount(); i++) {
					BodyPart body = mp.getBodyPart(i);
					String s = body.getDisposition();
					DataHandler handler = body.getDataHandler();
					if (body.getContentType().toLowerCase().startsWith("text/plain"))
						BambleLog.info("Mensagem", body.getContent().toString().trim());
					else
						BambleFile.download(type, path, body);
				}
			}
			setMessageAsRead(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void setMessageAsRead(Message message) {
		try {
			BambleLog.log("MARCANDO EMAIL COMO LIDO");
			message.setFlag(Flags.Flag.SEEN, true);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
