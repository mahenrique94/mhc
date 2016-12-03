package br.com.mhc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import br.com.mhc.io.Arquive;

public class TestaUpload {

	public static void main(String[] args) throws FileNotFoundException {
		Arquive upload = new Arquive();
		File file = new File("/Users/matheus/Desktop/stilize/index.html");
		InputStream is = new FileInputStream(file);
		upload.upload(is, "arquivos", file.getName());
	}
	
}
