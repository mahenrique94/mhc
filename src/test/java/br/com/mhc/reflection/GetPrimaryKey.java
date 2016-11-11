package br.com.mhc.reflection;

import java.util.Calendar;

import br.com.mhc.function.ClassFunction;
import br.com.mhc.model.Pessoa;

public class GetPrimaryKey {
	
	public static void main(String[] args) throws Exception {
		Pessoa pessoa = new Pessoa(1, "Matheus", 22, "M", Calendar.getInstance());		
		System.out.println(ClassFunction.getValueField(pessoa, "idade"));
	}
	
}
