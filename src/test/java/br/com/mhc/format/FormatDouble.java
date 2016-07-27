package br.com.mhc.format;

import java.text.DecimalFormat;

public class FormatDouble {

	public static void main(String[] args) {
		double valor = 100.55556;
		DecimalFormat format = new DecimalFormat("#.##");
		System.out.println(Double.valueOf(format.format(valor)));
	}
	
}
