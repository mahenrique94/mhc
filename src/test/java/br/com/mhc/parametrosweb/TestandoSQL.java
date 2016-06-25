package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.mhc.model.Pessoa;
import br.com.mhc.model.PessoaEndereco;


public class TestandoSQL {

	public static void main(String[] args) {
		Pessoa joao = new Pessoa(1, "João", 22, "M", Calendar.getInstance());
		PessoaEndereco joaoEndereco = new PessoaEndereco(1, joao, "Avenida Teste", Calendar.getInstance());
		ParametrosWebBuilder builder = new ParametrosWebBuilder();
		List<ParametrosWeb> parametrosWeb = new ArrayList<ParametrosWeb>();
		parametrosWeb.add(new ParametrosWeb("idade", "10", null, "<>"));
		System.out.println(builder.execute(Pessoa.class, parametrosWeb));
	}
	
}
