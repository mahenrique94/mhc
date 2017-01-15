package br.com.mhc.object;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.mhc.model.Pessoa;
import br.com.mhc.model.PessoaEndereco;

public class TestaClone {
	
	public static void main(String[] args) {
		List<PessoaEndereco> enderecos = new ArrayList<>();
		enderecos.add(new PessoaEndereco(1, new Pessoa(), "Teste", Calendar.getInstance()));
		Pessoa p1 = new Pessoa(1, "Matheus", 18, "M", Calendar.getInstance(), enderecos);
		Pessoa p2 = (Pessoa) p1.clone();
		System.out.println(p2.getNome());
		System.out.println(p2.getEnderecos().get(0).getEndereco());
	}

}
