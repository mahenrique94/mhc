package br.com.mhc.bamble;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.URLName;

public abstract class BambleConnect {

	public static Store connect(Properties p) {
		Session session = null;
		Store store = null;
		session = Session.getInstance(new Properties());
		try {
			BambleLog.log("[ACESSANDO O EMAIL]");
			store = session.getStore(getUrl(p));
			store.connect();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return store;
	}
	
	public static void disconnect(Folder folder, Store store) {
		try {
			BambleLog.log("[FECHANDO PASTA E STORE DO EMAIL]");
			folder.close(true);
			store.close();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static URLName getUrl(Properties p) {
		String protocol = p.getProperty("bamble.protocol");
		String host = p.getProperty("bamble.host");
		int port = Integer.parseInt(p.getProperty("bamble.port"));
		String account = p.getProperty("bamble.account");
		String password = p.getProperty("bamble.password");
		return new URLName(protocol, host, port, null, account, password);
	}
	
}
