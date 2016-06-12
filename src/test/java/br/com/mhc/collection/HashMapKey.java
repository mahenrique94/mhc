package br.com.mhc.collection;

import java.util.HashMap;

public class HashMapKey {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("nome", "like");
		System.out.println(hashMap);
		System.out.println(hashMap.get("nome"));
	}
	
}
