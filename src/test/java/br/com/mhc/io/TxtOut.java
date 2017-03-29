package br.com.mhc.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TxtOut {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/matheus/Desktop/log.txt");
		FileOutputStream out = new FileOutputStream(file);
		out.write("Teste".getBytes());
		out.write(System.lineSeparator().getBytes());
		out.write("Adicionei uma linha".getBytes());
		out.write(System.lineSeparator().getBytes());
		out.close();
	}
	
}
