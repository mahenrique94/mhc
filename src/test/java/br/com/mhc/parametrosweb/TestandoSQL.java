package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.mhc.model.Pessoa;


public class TestandoSQL {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Matheus", 22, "M", Calendar.getInstance());
		List<ParametrosWeb> parametros = new ArrayList<ParametrosWeb>();
//		parametros.add(new ParametrosWeb("nome", null, null, null, null, "nome desc"));
//		parametros.add(new ParametrosWeb("idade", p1.getIdade().toString(), null, "is not null", "or", "idade"));
//		parametros.add(new ParametrosWeb("datacadastro", "01/01/2016", null, ">", "or"));
		System.out.println(new ParametrosWebBuilder().createQuery(Pessoa.class, parametros));
	}
	
}
