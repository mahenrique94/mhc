package br.com.mhc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;

public class TestaProperties {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream(new File("email.properties")));
		Collection<Object> values = p.values();
		for (Object s : values) {
			System.out.println(s.toString());
		}
	}

}
