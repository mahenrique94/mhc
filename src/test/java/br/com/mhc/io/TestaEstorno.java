package br.com.mhc.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestaEstorno {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new FileReader("/Users/matheus/Desktop/estorno.txt"));
		while (br.ready()) {
			sb.append(br.readLine());
			sb.append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
	
}
