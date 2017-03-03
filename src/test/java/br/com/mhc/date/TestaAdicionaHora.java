package br.com.mhc.date;

import java.util.Calendar;

import com.ibm.icu.text.SimpleDateFormat;

public class TestaAdicionaHora {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar agora = Calendar.getInstance();
		System.out.println(format.format(agora.getTime()));
		
		agora.add(Calendar.HOUR, 24);
		System.out.println(format.format(agora.getTime()));
	}
	
}
