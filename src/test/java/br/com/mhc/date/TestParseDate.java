package br.com.mhc.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestParseDate {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatadorHora = new SimpleDateFormat("HH:mm");
		String data = "12/01/2016";
		String hora = "10:00";
		
		System.out.println(formatadorData.parse(data));
		System.out.println(formatadorHora.parse(hora));
	}

}
