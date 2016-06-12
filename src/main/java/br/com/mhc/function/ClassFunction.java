package br.com.mhc.function;

public class ClassFunction {

	public static String getTypeAttribute(Class clazz, String field) throws Exception {
		String[] fields = field.replace(".", ",").split(",");
		String type = null;
		for(int i = 0; i < fields.length; i++) {
			type = clazz.getDeclaredField(fields[i]).getType().getSimpleName();
			clazz = clazz.getDeclaredField(fields[i]).getType();
		}
		return type;
	}
	
}
