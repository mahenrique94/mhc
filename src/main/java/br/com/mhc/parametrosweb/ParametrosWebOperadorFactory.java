package br.com.mhc.parametrosweb;

public class ParametrosWebOperadorFactory {

	public static ParametrosWebOperador cria(String operador, String type, String parametroFinal) {
		if (operador != null) {
			if (operador.equals("is null"))
				return new ParametrosWebOperadorIsNull();
			if (operador.equals("is not null"))
				return new ParametrosWebOperadorIsNotNull();
			if (operador.equals("=")) {
				if (type.equals("String"))
					return new ParametrosWebOperadorIgualString();
				if (type.equals("Calendar"))
					return new ParametrosWebOperadorIgualCalendar();
				return new ParametrosWebOperadorIgual();
			}
			if (operador.equals("like")) {
				return new ParametrosWebOperadorLike();
			}
			if (operador.equals(">")) {
				if (type.equals("Calendar"))
					return new ParametrosWebOperadorMaiorCalendar();
				return new ParametrosWebOperadorMaior();
			}
			if (operador.equals("<")) {
				if (type.equals("Calendar"))
					return new ParametrosWebOperadorMenorCalendar();
				return new ParametrosWebOperadorMenor();
			}
			if (operador.equals(">=")) {
				if (type.equals("Calendar"))
					return new ParametrosWebOperadorMaiorIgualCalendar();
				return new ParametrosWebOperadorMaiorIgual();
			}
			if (operador.equals("<=")) {
				if (type.equals("Calendar"))
					return new ParametrosWebOperadorMenorIgualCalendar();
				return new ParametrosWebOperadorMenorIgual();
			}
			if (operador.equals("<>")) {
				if (type.equals("Calendar"))
					return new ParametrosWebOperadorDiferenteCalendar();
				return new ParametrosWebOperadorDiferente();
			}
		} else {
			if ((type.equals("Integer") || type.equals("Long") || type.equals("Double")) && parametroFinal != null)
				return new ParametrosWebOperadorMaiorIgual();
			if (type.equals("Calendar") && parametroFinal != null)
				return new ParametrosWebOperadorMaiorIgualCalendar();
			if (type.equals("String"))
				return new ParametrosWebOperadorLike();
			if (type.equals("Integer") || type.equals("Long") || type.equals("Double") || type.equals("Boolean"))
				return new ParametrosWebOperadorIgual();
			if (type.equals("Calendar"))
				return new ParametrosWebOperadorIgualCalendar();
		}
		throw new ParametrosWebExpection("Não foi possível localizar o operador da SQL");
	}
	
}