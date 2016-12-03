package br.com.mhc.io;

import java.io.IOException;

import br.com.mhc.function.FileFunction;

public class CriarPasta {

	public static void main(String[] args) throws IOException {
		FileFunction.create("/Users/matheus/Desktop/Arquivos/Upload/Blog");
		System.out.println(FileFunction.exists("/Users/matheus/Desktop/Arquivos"));
		System.out.println(FileFunction.exists("/Users/matheus/Desktop/Arquivos/Upload"));
		System.out.println(FileFunction.exists("/Users/matheus/Desktop/Arquivos/Upload/Blog"));
		System.out.println(FileFunction.exists("/Users/matheus/Desktop/Arquivos/Upload/Blog/teste.txt"));
	}
	
}
