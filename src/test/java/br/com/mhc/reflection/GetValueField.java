package br.com.mhc.reflection;

import java.util.Calendar;

import br.com.mhc.function.ClassFunction;
import br.com.mhc.model.Pessoa;
import br.com.mhc.model.PessoaEndereco;

public class GetValueField {
	
	public static void main(String[] args) throws Exception {
		Pessoa pessoa = new Pessoa(1, "Matheus", 22, "M", Calendar.getInstance());
		Pessoa nulo = new Pessoa(null, null, null, null, null);
		PessoaEndereco endereco = new PessoaEndereco(2, pessoa, "Teste", Calendar.getInstance());
		System.out.println(ClassFunction.getValueField(endereco, "endereco"));
	}
	
}
