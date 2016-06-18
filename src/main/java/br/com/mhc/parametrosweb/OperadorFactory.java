package br.com.mhc.parametrosweb;

public class OperadorFactory {

	public static Operador create(String type, String parametroFinal, String operador) {
		if (operador != null) {
			if (operador.equals("="))
				return new OperadorIgual(type);
			if (operador.equals("<"))
				return new OperadorMenor();
			if (operador.equals(">"))
				return new OperadorMaior();
			if (operador.equals("is null"))
				return new OperadorIsNull();
			if (operador.equals("is not null"))
				return new OperadorIsNotNull();
		}
		if ((type.equals("Integer") || type.equals("Long") || type.equals("Double") || type.equals("Boolean")) && parametroFinal != null)
			return new OperadorMaiorIgual();
		if (type.equals("Calendar") && parametroFinal != null)
			return new OperadorMaiorIgualCalendar();
		if (type.equals("String"))
			return new OperadorLike();
		if (type.equals("Integer") || type.equals("Long") || type.equals("Double") || type.equals("Boolean"))
			return new OperadorIgual(type);
		if (type.equals("Calendar"))
			return new OperadorCalendar();
		return null;
	}
	
}
