package br.com.mhc.reflection;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;

import br.com.mhc.function.ClassFunction;
import br.com.mhc.model.Pessoa;
import br.com.mhc.model.PessoaEndereco;

public class InvokeConstructor {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		PessoaEndereco endereco = (PessoaEndereco) ClassFunction.invokeConstructorDefaultChild(PessoaEndereco.class);
		System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(endereco.getDatacadastro().getTime()));
		System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(endereco.getIdpessoa().getDatacadastro().getTime()));
	}

}
