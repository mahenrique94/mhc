package br.com.mhc.parametrosweb;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.mhc.model.Pessoa;
import br.com.mhc.model.PessoaEndereco;

public class BuscaPessoaEndereco {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		ParametrosWebBuilder builder = new ParametrosWebBuilder();
		Pessoa matheus = new Pessoa(7, "Paola", 22, "M", Calendar.getInstance());
		matheus.setId(7);
		PessoaEndereco matheusEndereco = new PessoaEndereco(1, matheus, "Avenida Teste", Calendar.getInstance());
		
		List<ParametrosWeb> parametrosWeb = new ArrayList<ParametrosWeb>();
		parametrosWeb.add(new ParametrosWeb("idpessoa.id", matheusEndereco.getIdpessoa().getId().toString()));
		
		Query query = em.createQuery(builder.execute(PessoaEndereco.class, parametrosWeb));
		List<PessoaEndereco> pessoas = query.getResultList();
		
		for (PessoaEndereco pessoa : pessoas) {
			System.out.println(pessoa.getId() + " - " + pessoa.getEndereco());
		}
		
		em.getTransaction().commit();
		em.close();
	}

}
