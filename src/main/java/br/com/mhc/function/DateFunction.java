package br.com.mhc.function;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class DateFunction {

	
	public static Calendar setDaysInDate(Calendar date, int days) {
		Calendar data = new GregorianCalendar(date.get(date.YEAR), date.get(date.MONTH), date.get(date.DAY_OF_MONTH));
		data.add(Calendar.DAY_OF_MONTH, days);
		return data;
	}
	
	public static Calendar setMonthInDate(Calendar date, int month) {
		Calendar data = new GregorianCalendar(date.get(date.YEAR), date.get(date.MONTH), date.get(date.DAY_OF_MONTH));
		data.add(Calendar.MONTH, month);
		return data;
	}
	
	public static String formatBrazilianToAmerican(String data) {
		List<String> compose = Arrays.asList(data.split("/"));
		StringBuilder dataFinal = new StringBuilder();
		Collections.reverse(compose);
		for (int i = 0; i < compose.size(); i++) {
			dataFinal.append(compose.get(i));
			if (i < (compose.size() - 1))
				dataFinal.append("-");
		}
		return dataFinal.toString();
	}
	
}
