package br.com.mhc.function;

public class ClassFunction {

	/** @auth Matheus Castiglioni
	 *  Busca o tipo primitivo do field passado como parâmetro, caso o field seja um objeto ele navega no objeto até
	 *  encontrar o tipo primitivo(Ex: private Pessoa idpessoa > idpessoa > id)
	 *  @param clazz - Classe refência para buscar o tipo primitivo
	 *  @param field - Campo a ser buscado
	 *  @return type - Tipo do atributo primitivo(Ex: Integer, Double, Calendar, String, Long, Boolean...);
	 *  @example ClasseFunction.getTypeAttribute(Pessoa.class, "id");
	 *  @result Integer
	 */
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
