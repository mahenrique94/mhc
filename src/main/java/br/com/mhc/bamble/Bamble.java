package br.com.mhc.bamble;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Store;
import javax.mail.internet.InternetAddress;

import com.ibm.icu.text.SimpleDateFormat;

/** @auth Matheus Castiglioni
 *  Ler emails e baixar os anexos para salva-los em uma determinada pasta
 */
public class Bamble {

	public void start(Properties props) {
		Store store = BambleConnect.connect(props);
		Folder folder = BambleFolder.getFolder(props.getProperty("bamble.paste"), store);
		BambleMessages.readingMessages(folder, true, props.getProperty("bamble.fileType"), props.getProperty("bamble.path"));
		BambleConnect.disconnect(folder, store);
	}
	
	public static Properties getProperties(File properties) {
		Properties p = new Properties();
		try {
			BambleLog.log("[BUSCANDO ARQUIVO PROPERTIES PARA ACESSAR O EMAIL]");
			p.load(new FileInputStream(properties));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
}
