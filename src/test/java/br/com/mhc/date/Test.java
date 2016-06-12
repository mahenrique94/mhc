package br.com.mhc.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Calendar hoje = Calendar.getInstance();
		
		System.out.println(format.format(hoje.getTime()));
		
		hoje.add(Calendar.DAY_OF_MONTH, 30);
		System.out.println(format.format(hoje.getTime()));
	}
	
}
