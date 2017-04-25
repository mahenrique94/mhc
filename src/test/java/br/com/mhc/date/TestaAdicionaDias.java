package br.com.mhc.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.mhc.function.DateFunction;

public class TestaAdicionaDias {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar agora = new GregorianCalendar(2017, 0, 1);
		System.out.println(sdf.format(agora.getTime()));
		agora = DateFunction.setDaysInDate(agora, 40);
		System.out.println(sdf.format(agora.getTime()));
	}
	
}
