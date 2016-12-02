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
	 *  @param c - Classe refência para buscar o tipo primitivo
	 *  @param f - Campo a ser buscado
	 *  @return type - Tipo do atributo primitivo(Ex: Integer, Double, Calendar, String, Long, Boolean...);
	 *  @example ClasseFunction.getTypeAttribute(Pessoa.class, "id");
	 *  @result Integer
	 */
	public static String getTypeAttribute(Class c, String f) throws Exception {
		String[] fields = f.replace(".", ",").split(",");
		String type = null;
		for(int i = 0; i < fields.length; i++) {
			type = c.getDeclaredField(fields[i]).getType().getSimpleName();
			c = c.getDeclaredField(fields[i]).getType();
		}
		return type;
	}
	
	/** @auth Matheus Castiglioni
	 *  Invoca o construtor padrão(sem argumentos) de uma determinada classe
	 *  @param c - Classe referência para o construtor ser invocado
	 *  @return obj - Retorna uma instancia da classe com apenas a execução do construtor padrão
	 *  @example ClassFunction.invokeConstructorDefault(Pessoa.class)
	 *  @result Um obj do tipo Pessoa
	 */
	public static Object invokeConstructorDefault(Class c) {
		try {
			Constructor constructor = c.getConstructor();
			return constructor.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Não foi possível invocar o construtor default da classe" + c.getSimpleName());
		}
	}
	
	/** @auth Matheus Castiglioni
	 *  Invoca o construtor padrão(sem argumentos) de uma determinada classe e caso a mesma possua outras classes como
	 *  atributo também será invocado o construtor delas
	 *  @param c - Classe referência para o construtor ser invocado
	 *  @return obj - Retorna uma instancia da classe com apenas a execução do construtor padrão
	 *  @example ClassFunction.invokeConstructorDefaultChild(Pessoa.class)
	 *  @result Um obj do tipo Pessoa
	 */
	public static Object invokeConstructorDefaultChild(Class c) {
		Object obj = invokeConstructorDefault(c);
		Field[] fields = c.getDeclaredFields();
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
	 *  @param c - Classe referência para ser instanciada
	 *  @return obj - Retorna uma nova instancia da classe
	 *  @example ClassFunction.newInstance(Pessoa.class)
	 *  @result Um obj do tipo Pessoa
	 */
	public static Object newInstance(Class c) {
		try {
			return c.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Não foi possível invocar o construtor default da classe" + c.getSimpleName());
		}
	}
	
	/** @auth Matheus Castiglioni
	 *  Instância uma determinada classe e caso a mesma possua outras classes como
	 *  atributo elas também serão instanciadas
	 *  @param c - Classe referência para ser instanciada
	 *  @return obj - Retorna uma instancia da classe instanciada
	 *  @example ClassFunction.invokeConstructorDefaultChild(Pessoa.class)
	 *  @result Um obj do tipo Pessoa
	 */
	public static Object newInstanceChild(Class c) {
		Object obj = newInstance(c);
		Field[] fields = c.getDeclaredFields();
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
	
	/** @auth Matheus Castiglioni
	 *  Pega o valor de um campo via Reflection de acordo com o objeto e nome passado
	 *  @param o - Objeto alvo instanciado para ser feito a busca do campo
	 *  @param f - Nome do campo a ser buscado
	 *  @return Object - Retorna o valor obtido do campo
	 *  @example ClassFunction.getValueField(new Pessoa(1, "Matheus"), "id")
	 *  @result 1
	 */
	public static Object getValueField(Object o, String f) {
		try {
			Object obj = null;
			String[] split = f.split("\\.");
			for(int i = 0; i < split.length; i++) {
				Field field = o.getClass().getDeclaredField(split[i]);
				field.setAccessible(true);
				obj = field.get(o);
			}
			return obj;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Deu erro na tentativa de buscar o campo [" + f + "] do objeto [" + o + "]");
			e.printStackTrace();
		}
		return null;
	}

	/** @auth Matheus Castiglioni
	 *  Verifica se algum atributo do objeto passado como parâmetro possui valor
	 *  @param o - Objeto alvo a ser feita a busca de atributos com campo
	 *  @return Boolean - Retorna se algum atributo possui valor ou não, true = possui, false = não possui
	 *  @example ClassFunction.objHasAnyAttributeWithValue(new Pessoa(1, "Matheus"))
	 *  @result true
	 */
	public static boolean objHasAnyAttributeWithValue(Object o) {
		if (o != null) {
			Field[] fields = o.getClass().getDeclaredFields();
			for(int i = 0; i < fields.length; i++) {
				fields[i].setAccessible(true);
				try {
					return fields[i].get(o) != null;
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
}
