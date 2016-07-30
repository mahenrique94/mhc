package br.com.mhc.parametrosweb;

import java.util.Arrays;
import java.util.Collection;

/** @auth Matheus Castiglioni
 *  Classe responsável por pegar o parâmetro like adicionado sempre % para que a busca seja feita em qualquer parte do campo,
 *  Ex: campo1 like '%valor1%'
 */
public class ParametrosWebOperadorLike implements ParametrosWebOperador {

	@Override
	public Collection build(String campo, String parametroInicial, String parametroFinal) {
		// TODO Auto-generated method stub
		return Arrays.asList(this.campo(campo), "like", "'%" + parametroInicial + "%'");
	}

}
