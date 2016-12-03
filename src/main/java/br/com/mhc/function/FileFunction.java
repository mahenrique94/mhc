package br.com.mhc.function;

import java.io.File;
import java.io.IOException;

/** @auth Matheus Castiglioni
 *  Classe responsável por definir todas as funções realizadas com Arquivos,
 *  todos os métodos são estáticos para que não haja a necessidade de instanciar a classe para usá-los
 */
public class FileFunction {

	/** @auth Matheus Castiglioni
	 *  Verifica se existe uma determinada pasta ou arquivo
	 *  @param s - String referente a pasta ou arquivo que estamos buscando
	 *  @return result - True ou False se a pasta existe ou não respectivamente
	 *  @example FileFunction.exists("/Users/matheus");
	 *  @result true
	 */
	public static boolean exists(String s) {
		return new File(s).exists();
	}
	
	/** @auth Matheus Castiglioni
	 *  Determinada se existe uma determinada pasta ou arquivo, caso tenha algumas pastas onde o pai não existe é
	 *  criado recursivamente, se no fim for passado um arquivo o mesmo é criado em branco
	 *  @param s - String referente a pasta ou arquivo que estamos querendo criar
	 *  @return result - True ou False se a pasta ou arquivo foi criado ou não
	 *  @example FileFunction.create("/Users/matheus/Desktop/Arquivo/Upload/teste.txt");
	 *  @result true
	 */
	public static boolean create(String s) {
		String[] split = s.split("/");
		StringBuilder path = new StringBuilder("");
		boolean result = false;
		for(int i = 1; i < split.length; i++) {
			path.append("/");
			path.append(split[i]);
			if (!exists(path.toString())) {
				File file = new File(path.toString());
				if (split[i].contains(".")) {
					try {
						result = file.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					result = file.mkdir();
				}
			}
		}
		return result;
	}
	
}
