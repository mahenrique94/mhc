package br.com.mhc.function;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

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
	
	/** @auth Matheus Castiglioni
	 *  Invoca o construtor padrão(sem argumentos) de uma determinada classe e caso a mesma possua outras classes como
	 *  atributo também será invocado o construtor delas
	 *  @param clazz - Classe referência para o construtor ser invocado
	 *  @return obj - Retorna uma instancia da classe com apenas a execução do construtor padrão
	 *  @example ClassFunction.invokeConstructorDefaultChild(Pessoa.class)
	 *  @result Um obj do tipo Pessoa
	 */
	public static Object invokeConstructorDefaultChild(Class clazz) {
		Object obj = invokeConstructorDefault(clazz);
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			if (field.getType().getTypeName().contains("model"))
				try {
					field.setAccessible(true);
					field.set(obj, invokeConstructorDefault(field.getType()));
					invokeConstructorDefaultChild(field.getType());
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return obj;
	}
	
	/** @auth Matheus Castiglioni
	 *  Devolve uma nova instancia de uma determinada classe
	 *  @param clazz - Classe referência para ser instanciada
	 *  @return obj - Retorna uma nova instancia da classe
	 *  @example ClassFunction.newInstance(Pessoa.class)
	 *  @result Um obj do tipo Pessoa
	 */
	public static Object newInstance(Class clazz) {
		try {
			return clazz.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Não foi possível invocar o construtor default da classe" + clazz.getSimpleName());
		}
	}
	
	/** @auth Matheus Castiglioni
	 *  Instância uma determinada classe e caso a mesma possua outras classes como
	 *  atributo elas também serão instanciadas
	 *  @param clazz - Classe referência para ser instanciada
	 *  @return obj - Retorna uma instancia da classe instanciada
	 *  @example ClassFunction.invokeConstructorDefaultChild(Pessoa.class)
	 *  @result Um obj do tipo Pessoa
	 */
	public static Object newInstanceChild(Class clazz) {
		Object obj = newInstance(clazz);
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			if (field.getType().getTypeName().contains("model"))
				try {
					field.setAccessible(true);
					field.set(obj, newInstance(field.getType()));
					invokeConstructorDefaultChild(field.getType());
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return obj;
	}
	
}
