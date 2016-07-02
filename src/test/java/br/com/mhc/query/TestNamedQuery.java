package br.com.mhc.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.mhc.model.Pessoa;

public class TestNamedQuery {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		TypedQuery<Pessoa> query = em.createNamedQuery("buscaPessoa", Pessoa.class);
		String[] parametros = new String[2];
		parametros[0] = "01/06/2016";
		parametros[1] = "30/06/2016";
		
		for(int i = 0; i < parametros.length; i++) {
			query.setParameter(i, parametros[i]);
		}
		
		List<Pessoa> list = query.getResultList();
		
		for (Pessoa pessoa : list) {
			System.out.println(pessoa.getNome());
		}
		
		em.getTransaction().commit();
		em.close();
	}
	
}
