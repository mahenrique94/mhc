package br.com.mhc.function;

import java.util.Calendar;

public class DateFunction {

	public static Calendar setDaysInDate(Calendar date, int days) {
		date.add(Calendar.DAY_OF_MONTH, days);
		return date;
	}
	
	public static Calendar setMonthInDate(Calendar date, int month) {
		date.add(Calendar.MONTH, month);
		return date;
	}
	
}
