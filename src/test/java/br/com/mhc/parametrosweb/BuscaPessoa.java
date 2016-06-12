package br.com.mhc.parametrosweb;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import br.com.mhc.model.Pessoa;

public class BuscaPessoa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager em = factory.createEntityManager();
		
		ParametrosWebBuilder builder = new ParametrosWebBuilder();
		Pessoa pessoa = new Pessoa("Matheus", 22, "F", Calendar.getInstance());
		
		em.getTransaction().begin();
		
		builder.from(Pessoa.class).where("nome : like, sexo : like", pessoa);
		
		
		TypedQuery<?> typedQuery = em.createQuery(builder.execute(em.getCriteriaBuilder()));
		
		List<Pessoa> pessoas = (List<Pessoa>) typedQuery.getResultList();
		
		for (Pessoa pessoaResult : pessoas) {
			System.out.println(pessoaResult.getId() + " - " + pessoaResult.getNome());
		}
		
		em.getTransaction().commit();
		em.close();
	}
	
}
