package br.com.mhc.function;

import java.lang.reflect.Constructor;

/** @auth Matheus Castiglioni
 *  Classe responsável por definir todas as funções realizadas com Classes,
 *  todos os métodos são estáticos para que não haja a necessidade de instanciar a classe para usá-los
 */
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
	
	/** @auth Matheus Castiglioni
	 *  Invoca o construtor padrão(sem argumentos) de uma determinada classe
	 *  @param clazz - Classe referência para o construtor ser invocado
	 *  @return obj - Retorna uma instancia da classe com apenas a execução do construtor padrão
	 *  @example ClassFunction.invokeConstructorDefault(Pessoa.class)
	 *  @result Um obj do tipo Pessoa
	 */
	public static Object invokeConstructorDefault(Class clazz) {
		try {
			Constructor constructor = clazz.getConstructor();
			return constructor.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Não foi possível invocar o construtor default da classe" + clazz.getSimpleName());
		}
	}
	
}
