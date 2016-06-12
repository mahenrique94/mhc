package br.com.mhc.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CloneList {

	public static void main(String[] args) {
		List<String> original = new ArrayList<String>();
		original.add("UM");
		original.add("UM");
		original.add("DOIS");
		original.add("DOIS");
		original.add("TRES");
		original.add("TRES");
		
		List<String> copia = new ArrayList(new HashSet(original));
		
		System.out.println(original);
		System.out.println(copia);
	}
	
}
