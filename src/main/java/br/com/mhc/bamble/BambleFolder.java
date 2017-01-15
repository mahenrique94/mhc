package br.com.mhc.bamble;

import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.Store;

public abstract class BambleFolder {

	public static Folder getFolder(String folder, Store store) {
		Folder f = null;
		try {
			BambleLog.log("[BUSCANDO A PASTA NO EMAIL]");
			f = store.getFolder(folder);
			f.open(Folder.READ_WRITE);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
	
}
