package br.com.mhc.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mhc.model.PessoaEndereco;

public class TestLeftJoin {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		List<PessoaEndereco> list = em.createQuery("select a from PessoaEndereco a left join a.idpessoa where a.id = 1", PessoaEndereco.class).getResultList();
		
		for (PessoaEndereco pessoaEndereco : list) {
			System.out.println(pessoaEndereco.getIdpessoa().getNome());
		}
		
		em.getTransaction().commit();
		em.close();
	}

}
