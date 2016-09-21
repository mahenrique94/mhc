package br.com.mhc.reflection;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;

import br.com.mhc.function.ClassFunction;
import br.com.mhc.model.Pessoa;
import br.com.mhc.model.PessoaEndereco;

public class InvokeConstructor {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Pessoa pessoa = new Pessoa("Matheus");
		ClassFunction.invokeConstructorDefault(Pessoa.class);
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(pessoa.getDatacadastro().getTime()));
	}

}
