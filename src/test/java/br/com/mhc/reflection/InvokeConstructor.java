package br.com.mhc.reflection;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;

import br.com.mhc.function.ClassFunction;
import br.com.mhc.model.Pessoa;

public class InvokeConstructor {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Pessoa pessoa = (Pessoa) ClassFunction.invokeConstructorDefault(Pessoa.class);
		System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(pessoa.getDatacadastro().getTime()));
		System.out.println(pessoa.getNome());
	}

}
