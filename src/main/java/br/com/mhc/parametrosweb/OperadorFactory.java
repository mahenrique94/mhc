package br.com.mhc.parametrosweb;

public class OperadorFactory {

	public static Operador create(String type, String parametroFinal) {
		if ((type.equals("Integer") || type.equals("Long") || type.equals("Double") || type.equals("Boolean")) && parametroFinal != null)
			return new OperadorMaiorIgual();
		if (type.equals("Calendar") && parametroFinal != null)
			return new OperadorMaiorIgualCalendar();
		if (type.equals("String"))
			return new OperadorLike();
		if (type.equals("Integer") || type.equals("Long") || type.equals("Double") || type.equals("Boolean"))
			return new OperadorIgual();
		if (type.equals("Calendar"))
			return new OperadorCalendar();
		return null;
	}
	
}
