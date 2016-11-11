package br.com.mhc.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.mhc.function.DateFunction;

public class IntervaloData {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Calendar dataInicial = new GregorianCalendar(2016, 0, 1, 10, 00);
		Calendar dataFinal = new GregorianCalendar(2016, 0, 1, 10, 43);
		
		System.out.println(sdf.format(dataInicial.getTime()));
		System.out.println(sdf.format(dataFinal.getTime()));
		System.out.println();
		System.out.println(DateFunction.getIntervalHoursMinutesBetweenCalendar(dataInicial, dataFinal));
	}
	
}
