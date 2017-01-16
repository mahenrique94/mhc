package br.com.mhc.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("index.html"), "UTF-8");
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
	}
	
}
