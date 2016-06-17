package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.mhc.model.Pessoa;


public class TestandoSQL {

	public static void main(String[] args) {
		Pessoa matheus = new Pessoa("Matheus", 22, "M", Calendar.getInstance());
		ParametrosWebBuilder builder = new ParametrosWebBuilder();
		List<ParametrosWeb> parametrosWeb = new ArrayList<ParametrosWeb>();
		parametrosWeb.add(new ParametrosWeb("nome", matheus.getNome()));
		parametrosWeb.add(new ParametrosWeb("idade", "inativo", null, "<>"));
		System.out.println(builder.execute(Pessoa.class, parametrosWeb));
	}
	
}
