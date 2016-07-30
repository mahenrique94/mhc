package br.com.mhc.function;

public class StringFunction {
	
	/** @auth Matheus Castiglioni
	 *  Pega uma determinada palavra e devolve a mesma com sua primeira letra em Maiúscula
	 *  @param s - Palavra alvo a ser devolvida sua primeira letra em Maiúscula
	 *  @return s - Palavra já com sua primeira letra em Maiúscula
	 *  @example StringFunction.firstLetterUpper("matheus");
	 *  @result "Matheus"
	 */
	public static String firstLetterUpper(String s) {
		return s.substring(0, 1).toUpperCase().concat(s.substring(1));
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
