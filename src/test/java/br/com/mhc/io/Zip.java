package br.com.mhc.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/matheus/Desktop/stilize/index.html");
		OutputStream os = new FileOutputStream(file);
		ZipOutputStream zip = new ZipOutputStream(os);
		ZipEntry entry = new ZipEntry(file.getName());
		zip.putNextEntry(entry);
		
		zip.finish();
	}
	
}
