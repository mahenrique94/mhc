package br.com.mhc.documenteletronic;

import br.com.mhc.document.CNPJ;

public abstract class CTEMDFENFE implements DocumentEletronic {
	
	private String chave;
	
	public CTEMDFENFE(String chave) {
		// TODO Auto-generated constructor stub
		setChave(chave);
	}
	
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	
	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return new CTEMDFENFEValidator().isValid(getChave(), getDigit());
	}

	@Override
	public String getUF() {
		// TODO Auto-generated method stub
		return getChave().substring(0, 2);
	}
	
	@Override
	public int getMonth() {
		// TODO Auto-generated method stub
		return Integer.parseInt(getChave().substring(4, 6));
	}
	
	@Override
	public int getYear() {
		// TODO Auto-generated method stub
		return Integer.parseInt(getChave().substring(2, 4));
	}

	@Override
	public CNPJ getCnpj() {
		// TODO Auto-generated method stub
		return new CNPJ(getChave().substring(6, 20));
	}

	@Override
	public int getModel() {
		// TODO Auto-generated method stub
		return Integer.parseInt(getChave().substring(20, 22));
	}
	
	@Override
	public int getSerie() {
		// TODO Auto-generated method stub
		return Integer.parseInt(getChave().substring(22, 25));
	}
	
	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return Integer.parseInt(getChave().substring(25, 34));
	}
	
	@Override
	public int getEmissao() {
		// TODO Auto-generated method stub
		return Integer.parseInt(getChave().substring(34, 35));
	}
	
	@Override
	public int getCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(getChave().substring(35, 43));
	}
	
	@Override
	public int getDigit() {
		// TODO Auto-generated method stub
		return Integer.parseInt(getChave().substring(43, 44));
	}

}
