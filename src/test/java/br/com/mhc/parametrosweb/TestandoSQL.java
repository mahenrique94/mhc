package br.com.mhc.parametrosweb;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.mhc.model.Pessoa;


public class TestandoSQL {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Matheus", 22, "M", Calendar.getInstance());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<ParametrosWeb> parametros = new ArrayList<ParametrosWeb>();
		parametros.add(new ParametrosWeb("idade", "18", null, ">="));
		parametros.add(new ParametrosWeb("datacadastro", sdf.format(p1.getDatacadastro().getTime()), sdf.format(p1.getDatacadastro().getTime()), ">="));
		System.out.println(new ParametrosWebBuilder().createQuery(Pessoa.class, parametros));
	}
	
}
