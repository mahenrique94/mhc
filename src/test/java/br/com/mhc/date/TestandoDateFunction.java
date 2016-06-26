package br.com.mhc.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.mhc.function.DateFunction;
import br.com.mhc.model.Pessoa;

public class TestandoDateFunction {

	public static void main(String[] args) {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa matheus = new Pessoa(1, "Matheus", 22, "M", Calendar.getInstance());
		Pessoa joao = new Pessoa(2, "João", 15, "M", Calendar.getInstance());
		
		matheus.setDatacadastro(DateFunction.setMonthInDate(joao.getDatacadastro(), 1));
		
		System.out.println("Data do Cadastro de " + matheus.getNome() + " é: " + formatador.format(matheus.getDatacadastro().getTime()));
		System.out.println("Data do Cadastro de " + joao.getNome() + " é: " + formatador.format(joao.getDatacadastro().getTime()));
	}
	
}
