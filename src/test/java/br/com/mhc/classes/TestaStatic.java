package br.com.mhc.classes;

import br.com.mhc.model.Pessoa;

public class TestaStatic {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.ola();
		Pessoa.ola();
	}
	
}
