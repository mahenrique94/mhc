package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.mhc.model.Usuario;

public class TestandoSQLInjection {

	public static void main(String[] args) {
		Usuario usuario = new Usuario("Matheus", "mahenrique94", "123456", Calendar.getInstance());
		List<ParametrosWeb> parametros = new ArrayList<ParametrosWeb>();
		parametros.add(new ParametrosWeb("usuario", "admin' or 1 = 1 -- "));
		parametros.add(new ParametrosWeb("senha", "admin"));
		System.out.println(new ParametrosWebBuilder().createQuery(Usuario.class, parametros));
	}
	
}
