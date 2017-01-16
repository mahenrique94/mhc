package br.com.mhc.bamble;

import java.io.IOException;

import javax.activation.DataHandler;
import javax.mail.BodyPart;
import javax.mail.MessagingException;

import br.com.mhc.io.Arquive;

public abstract class BambleFile {

	public static void download(String type, String path, BodyPart body) {
		try {
			DataHandler handler = body.getDataHandler();
			String fileName = handler.getName();
			if (fileName != null) {
				BambleLog.info("Anexo", fileName);
				if (isFileWish(type, fileName)) {
					save(path, handler);
				}
			}
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static boolean isFileWish(String type, String fileName) {
		String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
		return extension.equals(type);
	}
	
	private static void save(String path, DataHandler handler) {
		BambleLog.log("SALVANDO ANEXO");
		BambleLog.info("Pasta", path);
		BambleLog.info("Nome do Arquivo", handler.getName());
		Arquive a = new Arquive();
		try {
			a.upload(handler.getInputStream(), path, handler.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
