package br.com.mhc.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrimeiroUltimoDiaDoMes {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar janeiro = new GregorianCalendar(2017, 0, 10);
		System.out.println(sdf.format(janeiro.getTime()));
		System.out.println(janeiro.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println(janeiro.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println();
		
		Calendar fevereiro = new GregorianCalendar(2017, 1, 12);
		System.out.println(sdf.format(fevereiro.getTime()));
		System.out.println(fevereiro.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println(fevereiro.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println();
		
		Calendar marco = new GregorianCalendar(2017, 2, 21);
		System.out.println(sdf.format(marco.getTime()));
		System.out.println(marco.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println(marco.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println();
		
		Calendar abril = new GregorianCalendar(2017, 3, 7);
		System.out.println(sdf.format(abril.getTime()));
		System.out.println(abril.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println(abril.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println();
	}
	
}
