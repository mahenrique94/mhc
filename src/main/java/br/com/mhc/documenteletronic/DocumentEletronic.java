package br.com.mhc.documenteletronic;

import br.com.mhc.document.CNPJ;

public interface DocumentEletronic {

	public boolean isValid();
	public String getUF();
	public int getMonth();
	public int getYear();
	public CNPJ getCnpj();
	public int getModel();
	public int getSerie();
	public int getNumber();
	public int getEmissao();
	public int getCode();
	public int getDigit();
	
}
