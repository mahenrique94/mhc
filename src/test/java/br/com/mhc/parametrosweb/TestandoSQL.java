package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.mhc.model.Pessoa;


public class TestandoSQL {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Matheus", 22, "M", Calendar.getInstance());
		List<ParametrosWeb> parametros = new ArrayList<ParametrosWeb>();
		parametros.add(new ParametrosWeb("datacadastro", "01/01/2016", null, null, null, "datacadastro"));
		parametros.add(new ParametrosWeb("nome", p1.getNome(), null, "="));
		parametros.add(new ParametrosWeb("idade", p1.getIdade().toString(), null, null, null, "idade"));
		System.out.println(new ParametrosWebBuilder().createQuery(Pessoa.class, parametros));
	}
	
}
