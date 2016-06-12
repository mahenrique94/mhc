package br.com.mhc.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAfter {

	public static void main(String[] args) {
		Calendar dataInicial = new GregorianCalendar(2016, 3, 18, 8, 00);
		Calendar dataFinal = new GregorianCalendar(2016, 3, 18, 7, 00);
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println(formatador.format(dataInicial.getTime()));
		System.out.println(formatador.format(dataFinal.getTime()));
		
		if (dataFinal.after(dataInicial))
			System.out.println("DataFinal maior que DataInicial");
		else
			System.out.println("DataFinal menor que DataInicial");
	}
	
}
