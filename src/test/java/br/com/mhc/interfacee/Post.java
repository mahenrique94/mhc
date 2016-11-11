package br.com.mhc.interfacee;

import java.util.Calendar;

public class Post {

	private String nome;
	private String titulo;
	private Calendar data;
	
	public Post() {
		// TODO Auto-generated constructor stub
	}
	public Post(String nome, String titulo, Calendar data) {
		this.nome = nome;
		this.titulo = titulo;
		this.data = data;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	
//	@Override
//	public String loga() {
//		// TODO Auto-generated method stub
//		return String.format("%s postou %s às %s", getNome(), getTitulo(), new SimpleDateFormat("dd/MM/yyyy HH:mm").format(getData().getTime()));
//	}
	
}
