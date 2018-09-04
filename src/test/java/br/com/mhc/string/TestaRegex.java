package br.com.mhc.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestaRegex {

	public static void main(String[] args) {
		StringBuilder resultado = new StringBuilder();
		String s = "<?xml version=\"1.0\"?><data><item0><chave>35170908676162000156570010000236191000489454</chave><protocolo>0588699990867616200015657001000023619086</protocolo></item0></data>";
		String r = "((<chave.+?>)|(<protocolo.+?>))";
		Pattern pattern = Pattern.compile(r);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			resultado.append(matcher.group());
			resultado.append("\n");
		}
		System.out.println(resultado.toString());
	}
	
}
