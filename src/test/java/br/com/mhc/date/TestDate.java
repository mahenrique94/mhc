package br.com.mhc.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class TestDate {
	public static void main(String[] args) {
		
		Calendar data = Calendar.getInstance();
		Calendar fevereiro = new GregorianCalendar(2016, 1, 10);
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(data.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println(fevereiro.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
	
//	public static void main(String[] args) {
//		Calendar dataPagamento = Calendar.getInstance();
//		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//		int intervalo = 15;
//		int qtdParcela = 3;
//		for (int i = 0; i < qtdParcela; i++) {
//			dataPagamento.add(Calendar.DAY_OF_MONTH, intervalo);
//			System.out.println(format.format(dataPagamento.getTime()));
//		}
//	}
	
}
