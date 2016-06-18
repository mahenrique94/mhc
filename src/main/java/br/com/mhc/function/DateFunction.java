package br.com.mhc.function;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class DateFunction {

	public static Calendar setDaysInDate(Calendar date, int days) {
		date.add(Calendar.DAY_OF_MONTH, days);
		return date;
	}
	
	public static Calendar setMonthInDate(Calendar date, int month) {
		date.add(Calendar.MONTH, month);
		return date;
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
