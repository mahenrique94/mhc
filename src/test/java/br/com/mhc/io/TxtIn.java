package br.com.mhc.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TxtIn {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/matheus/Desktop/log.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
	}
	
}
