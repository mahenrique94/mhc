package br.com.mhc.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.mhc.function.DateFunction;

public class FormatDate {

	public static void main(String[] args) throws Exception {
		String dataString = "25/05/2016";
		Calendar data = Calendar.getInstance();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println(DateFunction.formatBrazilianToAmerican(dataString));
	}
	
}
