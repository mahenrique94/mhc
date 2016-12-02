package br.com.mhc.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.mhc.function.DateFunction;

public class CalculandoDia {

	public static void main(String[] args) {
		Calendar inicio = new GregorianCalendar(2016, 11, 1);
		Calendar fim = new GregorianCalendar(2016, 11, 10);
		System.out.println(DateFunction.getIntervalDaysBetweenCalendar(inicio, fim));
	}
	
}
