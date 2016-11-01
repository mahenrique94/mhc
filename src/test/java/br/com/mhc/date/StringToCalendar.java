package br.com.mhc.date;

import java.text.SimpleDateFormat;

import br.com.mhc.function.DateFunction;

public class StringToCalendar {

	public static void main(String[] args) throws Exception {
		String data = "10:10";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println(sdf.format(DateFunction.stringWithHourToCalendar(data).getTime()));
	}
	
}
