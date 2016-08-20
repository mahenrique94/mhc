package br.com.mhc.reflection;

import java.lang.reflect.Field;
import java.util.Calendar;

import br.com.mhc.model.Pessoa;

public class SetField {
	
	public static void main(String[] args) throws Exception {
		Pessoa pessoa = new Pessoa(1, "Matheus", 22, "M", Calendar.getInstance());
		Object obj = pessoa;
		Field field = obj.getClass().getDeclaredField("nome");
		field.setAccessible(true);
		field.set(obj, "Castiglioni");
		System.out.println(field.get(obj));
	}

}
