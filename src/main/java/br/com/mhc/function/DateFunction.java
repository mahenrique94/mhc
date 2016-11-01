package br.com.mhc.function;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/** @auth Matheus Castiglioni
 *  Classe responsável por definir todas as funções realizadas com Datas,
 *  todos os métodos são estáticos para que não haja a necessidade de instanciar a classe para usá-los
 */
public class DateFunction {

	/** @auth Matheus Castiglioni
	 *  Pega um data em formato Brazileiro(DD/MM/YYYY) e converte para formato americano(YYY/MM/DD)
	 *  @param s - Data no formato brazileiro
	 *  @return dataFinal - Data no formato americano
	 *  @example DateFunction.formatBrazilianToAmerican("25/05/1994");
	 *  @result "1994-05-25"
	 */
	public static String formatBrazilianToAmerican(String s) {
		List<String> compose = Arrays.asList(s.split("/"));
		StringBuilder dataFinal = new StringBuilder();
		String hora = null;
		Collections.reverse(compose);
		// Verificando se a data possui hora, caso possua eu seto a variável hora para utiliza-la no final do método
		if (compose.get(0).indexOf(":") > 0)
			hora = compose.get(0).split(" ")[1];
		for (int i = 0; i < compose.size(); i++) {
			// Verificando se a a data possui hora, caso possua eu separo o ano da hora para poder inseri-lo
			if (compose.get(0).indexOf(":") > 0)
				dataFinal.append(compose.get(i).split(" ")[0]);
			else
				dataFinal.append(compose.get(i));
			
			if (i < (compose.size() - 1))
				dataFinal.append("-");
		}
		if (hora != null)
			dataFinal.append(" " + hora);
		return dataFinal.toString();
	}
	
	/** @auth Matheus Castiglioni
	 *  Pega uma determinada data e adiciona determinada quantidade de dias nessa data
	 *  @param date - Data alvo a ser adicionada os dias
	 *  @param days - Quantidade de dias a ser adicionados na data
	 *  @return data - Data com os dias adicionados
	 *  @example DateFunction.setDaysInDate(new GregorianCalendar(1994, 4, 25).getInstance(), 5);
	 *  @result "1994-05-30"
	 */
	public static Calendar setDaysInDate(Calendar date, int days) {
		Calendar data = new GregorianCalendar(date.get(date.YEAR), date.get(date.MONTH), date.get(date.DAY_OF_MONTH));
		data.add(Calendar.DAY_OF_MONTH, days);
		return data;
	}
	
	/** @auth Matheus Castiglioni
	 *  Pega uma determinada data e adiciona determinada quantidade de meses nessa data
	 *  @param date - Data alvo a ser adicionada os meses
	 *  @param month - Quantidade de meses a ser adicionados na data
	 *  @return data - Data com os meses adicionados
	 *  @example DateFunction.setMonthInDate(new GregorianCalendar(1994, 4, 25).getInstance(), 5);
	 *  @result "1994-10-25"
	 */
	public static Calendar setMonthInDate(Calendar date, int month) {
		Calendar data = new GregorianCalendar(date.get(date.YEAR), date.get(date.MONTH), date.get(date.DAY_OF_MONTH));
		data.add(Calendar.MONTH, month);
		return data;
	}
	
	/** @auth Matheus Castiglioni
	 *  Pega uma determinada data e adiciona determinada quantidade de anos nessa data
	 *  @param date - Data alvo a ser adicionada os anos
	 *  @param year - Quantidade de anos a ser adicionados na data
	 *  @return data - Data com os anos adicionados
	 *  @example DateFunction.setYearInDate(new GregorianCalendar(1994, 4, 25).getInstance(), 5);
	 *  @result "1999-05-25"
	 */
	public static Calendar setYearInDate(Calendar date, int year) {
		Calendar data = new GregorianCalendar(date.get(date.YEAR), date.get(date.MONTH), date.get(date.DAY_OF_MONTH));
		data.add(Calendar.YEAR, year);
		return data;
	}
	
	/** @auth Matheus Castiglioni
	 *  Pega uma string e converte para o tipo Calendar
	 *  @param s - Data no formato String a ser convertida para Calendar
	 *  @return dataParse - Data convertido de String para Calendar
	 *  @example DateFunction.stringToCalendar("1994-05-25");
	 */
	public static Calendar stringToCalendar(String s) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataParse = null;
		try {
			dataParse = sdf.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sdf.getCalendar();
	}
	
}
