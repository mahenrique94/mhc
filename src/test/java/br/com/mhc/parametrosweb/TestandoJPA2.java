package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.mhc.model.Pessoa;

public class TestandoJPA2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Pessoa> query = builder.createQuery(Pessoa.class);
		
		Pessoa matheus = new Pessoa("Matheus", 22, "M", Calendar.getInstance());
		
		Root<Pessoa> root = query.from(Pessoa.class);
		Path<String> nome = root.<String> get("nome");
		Path<Integer> idade = root.<Integer> get("idade");
		
		List<Predicate> predicates = new ArrayList<Predicate>();
		predicates.add(builder.like(nome, "%" + matheus.getNome() + "%"));
//		predicates.add(builder.greaterThanOrEqualTo(idade, matheus.getIdade()));
		
		query.where((Predicate[]) predicates.toArray(new Predicate[0]));
		
		TypedQuery<Pessoa> typedQuery = em.createQuery(query);
		List<Pessoa> pessoas = typedQuery.getResultList();
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getId() + " - " + pessoa.getNome());
		}
		
		em.getTransaction().commit();
		em.close();
	}
	
}
