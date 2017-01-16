package br.com.mhc.bamble;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class BambleLog {
	
	public static void log(String s) {
		System.out.println("[" + s + "] -------------------------------------------------- " + new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime()));
	}
	
	public static void info(String s, String info) {
		System.out.println("[" + s + "]: " + info);
	}

}
