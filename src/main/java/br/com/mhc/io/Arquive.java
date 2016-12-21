package br.com.mhc.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.annotation.processing.FilerException;

/** @auth Matheus Castiglioni
 *  Classe utilizada para fazer upload e download de arquivos
 */
public class Arquive {

	private static String PATH = "";
	private final static int FILE_MAX_SIZE = 1024 * 8;
	
	public Arquive() {
		// TODO Auto-generated constructor stub
	}
	public Arquive(String path) {
		// TODO Auto-generated constructor stub
		this.PATH = path;
	}
	
	public void upload(final InputStream upload, final String paste, final String fileName) {
		if (upload != null && paste != null && fileName != null) {
			try {
				save(upload, new FileOutputStream(create(paste, fileName)));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public File download(final String paste, final String fileName) {
		return find(create(paste, fileName));
	}
	
	private File create(final String paste, final String fileName) {
		return new File(String.format("%s/%s/%s", PATH, paste.replaceAll("[\\-]", "/"), fileName));
	}
	
	private File find(final File file) {
		if(!file.exists()) {
			try {
				throw new FilerException(file.getAbsolutePath());
			} catch (FilerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return file;
	}
	
	private void save(final InputStream to, final OutputStream from) {
		byte[] bytes = new byte[FILE_MAX_SIZE];
		int i = 0;
		try {
			while((i = to.read(bytes)) >= 0) {
				from.write(bytes, 0, i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
