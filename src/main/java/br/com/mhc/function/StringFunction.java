package br.com.mhc.function;

import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.MaskFormatter;

/** @auth Matheus Castiglioni
 *  Classe responsável por definir todas as funções realizadas com String's,
 *  todos os métodos são estáticos para que não haja a necessidade de instanciar a classe para usá-los
 */
public abstract class StringFunction {
	
	/** @auth Matheus Castiglioni
	 *  Transforma um char em String
	 *  @param c - Char a ser transformado em String
	 *  @example StringFunction.charToString("C");
	 */
	public static String charToString(char c) {
		return String.valueOf(c);
	}
	
	/** @auth Matheus Castiglioni
	 *  Pega uma determinada palavra e devolve a mesma com sua primeira letra em Maiúscula
	 *  @param s - Palavra alvo a ser devolvida sua primeira letra em Maiúscula
	 *  @return s - Palavra já com sua primeira letra em Maiúscula
	 *  @example StringFunction.firstLetterUpper("matheus");
	 *  @result "Matheus"
	 */
	public static String firstLetterUpper(String s) {
		return s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
	}
	
	/** @auth Matheus Castiglioni
	 *  Pega uma determinada frase e devolve a mesma com cada palavra com sua primeira letra em Maiúscula
	 *  @param s - Frase alvo a ser devolvida as palavras com a primeira letra em Maiúscula
	 *  @return builder - Frase processada
	 *  @example StringFunction.firstLetterUpperPhrase("matheus henrique");
	 *  @result "Matheus Henrique"
	 */
	public static String firstLetterUpperPhrase(String s) {
		StringBuilder builder = new StringBuilder();
		String[] split = s.split(" ");
		for(int i = 0; i < split.length; i++) {
			builder.append(firstLetterUpper(split[i]));
			builder.append(" ");
		}
		return builder.toString();
	}
	
	/** @auth Matheus Castiglioni
	 *  Pega uma determinada string e formata de acordo com a mascára passada
	 *  @param mask - Formato para a string
	 *  @return s - String á ser formatada
	 *  @example StringFunction.format("###.###.###-##", "11111111111");
	 *  @result "111.111.111-11"
	 */
	public static String format(String mask, String s) {
		try {
			MaskFormatter mf = new MaskFormatter(mask);
			mf.setValueContainsLiteralCharacters(false);
			return mf.valueToString(s).toString();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("String [" + s + "] ja esta formatada");
			return s;
		}
	}
	
	
	/** @auth Matheus Castiglioni
	 *  Pega uma determinada String e verifica se contém a regex passada
	 *  @param regex - Expressão regular a ser processada
	 *  @param s - String a ser verificada
	 *  @return builder - String já invertida
	 *  @example StringFunction.isMatcher("([1]{11})", "11111111111");
	 *  @result true
	 */
	public static boolean isMatcher(String regex, String s) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		return matcher.find();
	}
	
	/** @auth Matheus Castiglioni
	 *  Pega uma determinada String e devolve a mesma ao contrário
	 *  @param s - String a ser invertida
	 *  @return builder - String já invertida
	 *  @example StringFunction.reverse("suehtaM");
	 *  @result "Matheus"
	 */
	public static String reverse(String s) {
		StringBuilder builder = new StringBuilder(s);
		builder.reverse();
		return builder.toString();
	}
	
	/** @auth Matheus Castiglioni
	 *  Pega uma String retira suas barras concatenando as próximas palavras com suas letras em Maiúsculas 
	 *  @param s - String com "/" a ser concatenada
	 *  @return builder - String sem as barras e realizado o capitalize das palavras
	 *  @example StringFunction.splitBarToFirstUpper("uma/frase/com/barra")
	 *  @result umaFraseComBarra
	 */
	public static String splitBarToFirstUpper(String s) {
		String[] split = s.split("/");
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < split.length; i++) {
			String string = split[i]; 
			if (i > 0)
				string = StringFunction.firstLetterUpper(split[i]);
			builder.append(string);	
		}
		return builder.toString();
	}
	
	/** @auth Matheus Castiglioni
	 *  Transforma uma substring em array
	 *  @param s - String a ser retirado os espaços
	 *  @param begin - Inicio da substring
	 *  @param end - Fim do substring
	 *  @return array - Array baseado no substring
	 *  @example StringFunction.substringToArray("Matheus", 0, 6);
	 *  @result [M, a, t, h, e, u, s]
	 */
	public static String[] substringToArray(String s, int begin, int end) {
		String[] array = new String[end + 1];
		for (int i = begin; i < end; i++) {
			array[i] = charToString(s.charAt(i));
		}
		return array;
	}

	/** @auth Matheus Castiglioni
	 *  Tera todos os espaços de uma determinada String com RegEx
	 *  @param s - String a ser retirado os espaços
	 *  @return s - String sem espaços
	 *  @example StringFunction.trimAll(" Matheus Henrique Castiglioni ");
	 *  @result "MatheusHenriqueCastiglioni"
	 */
	public static String trimAll(String s) {
		return s.replaceAll("\\s", "");
	}
	
	/** @auth Matheus Castiglioni
	 *  Tera todos os espaços á esquerda de uma determinada String com RegEx
	 *  @param s - String a ser retirado os espaços á esquerda
	 *  @return s - String sem espaços á esquerda
	 *  @example StringFunction.trimAll(" Matheus Henrique Castiglioni ");
	 *  @result "Matheus Henrique Castiglioni "
	 */
	public static String trimLeft(String s) {
		return s.replaceAll("^\\s", "");
	}
	
	/** @auth Matheus Castiglioni
	 *  Tera todos os espaços á direita de uma determinada String com RegEx
	 *  @param s - String a ser retirado os espaços á direita
	 *  @return s - String sem espaços á direita
	 *  @example StringFunction.trimAll(" Matheus Henrique Castiglioni ");
	 *  @result " Matheus Henrique Castiglioni"
	 */
	public static String trimRight(String s) {
		return s.replaceAll("\\s$", "");
	}
	
}
