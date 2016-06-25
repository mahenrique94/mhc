package br.com.mhc.parametrosweb;

import java.util.List;

public class OperadorDiferente implements Operador {

	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public OperadorDiferente(String type) {
		// TODO Auto-generated constructor stub
		setType(type);
	}
	
	@Override
	public String get(List<String> parametro) {
		// TODO Auto-generated method stub
		if (getType().equals("String"))
			return "<> '" + parametro.get(1) + "'";
		return "<> " + parametro.get(1);
	}

}
