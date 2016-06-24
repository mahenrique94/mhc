package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import br.com.mhc.model.Pessoa;

public class BuscaPessoa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		ParametrosWebBuilder builder = new ParametrosWebBuilder();
		Pessoa matheus = new Pessoa(7, "Paola", 22, "M", Calendar.getInstance());
		
		List<ParametrosWeb> parametrosWeb = new ArrayList<ParametrosWeb>();
		parametrosWeb.add(new ParametrosWeb("nome", "João"));
		parametrosWeb.add(new ParametrosWeb("datacadastro", "2016-01-01", "2016-12-31"));
		parametrosWeb.add(new ParametrosWeb("idade", "18", "30"));
		
		Query query = em.createQuery(builder.execute(Pessoa.class, parametrosWeb));
		List<Pessoa> pessoas = query.getResultList();
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getId() + " - " + pessoa.getNome());
		}
		
		em.getTransaction().commit();
		em.close();
	}
	
}
