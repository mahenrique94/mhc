package br.com.mhc.collection;

import java.util.HashMap;

import br.com.mhc.model.Pessoa;

public class HashMapKey {

	public static void main(String[] args) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("nome", new Pessoa("Matheus"));
		System.out.println(hashMap);
		System.out.println(hashMap.get("nome"));
	}
	
}
