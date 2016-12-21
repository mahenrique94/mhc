package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mhc.model.Usuario;

public class TestandoJPAInjection {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Usuario usuario = new Usuario("Matheus", "mahenrique94", "123456", Calendar.getInstance());
		List<ParametrosWeb> parametros = new ArrayList<ParametrosWeb>();
		parametros.add(new ParametrosWeb("usuario", "admin' or 1 = 1 or '%' = '"));
		parametros.add(new ParametrosWeb("senha", "admin"));
		String query = new ParametrosWebBuilder().createQuery(Usuario.class, parametros);
		
		List<Usuario> usuarios = em.createQuery(query).getResultList();
		for (Usuario u : usuarios) {
			System.out.println(u.getNome());
		}
		
		em.getTransaction().commit();
		em.close();
	}
	
}
