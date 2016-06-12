package br.com.mhc.reflection;

import java.lang.reflect.Field;
import java.util.Calendar;

import br.com.mhc.model.Pessoa;

public class ValueFieldObject {

	public static void main(String[] args) throws Exception {
		Pessoa pessoa = new Pessoa("Matheus", 22, "M", Calendar.getInstance());
		Object obj = pessoa;
		Field field = obj.getClass().getDeclaredField("nome");
		field.setAccessible(true);
		System.out.println(field.get(obj));
	}
	
}
