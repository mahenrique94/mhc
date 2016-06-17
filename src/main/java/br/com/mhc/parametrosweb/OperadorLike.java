package br.com.mhc.parametrosweb;

import java.util.List;

public class OperadorLike implements Operador {

	@Override
	public String get(List<String> parametro) {
		// TODO Auto-generated method stub
		return "like '%" + parametro.get(1) + "%'";
	}

}
