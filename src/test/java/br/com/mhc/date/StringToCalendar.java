package br.com.mhc.date;

import java.text.SimpleDateFormat;

import br.com.mhc.function.DateFunction;

public class StringToCalendar {

	public static void main(String[] args) throws Exception {
		String data = "01/01/2016";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(DateFunction.stringFromBrazilianWithDateToCalendar(data).getTime()));
	}
	
}
