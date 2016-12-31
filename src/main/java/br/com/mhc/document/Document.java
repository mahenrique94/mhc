package br.com.mhc.document;

public interface Document {

	public boolean isValid();
	public String format();
	public String unformat();
	public int getFirstDigit();
	public int getSecondDigit();
	String[] getNumbersToFirstDigit();
	String[] getNumbersToSecondDigit();
	boolean isFormated();
	
}
