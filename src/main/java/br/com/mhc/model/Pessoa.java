package br.com.mhc.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer idade;
	private String sexo;
	private Calendar datacadastro;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	public Pessoa(String nome, Integer idade, String sexo, Calendar datacadastro) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.datacadastro = datacadastro;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Calendar getDatacadastro() {
		return datacadastro;
	}
	public void setDatacadastro(Calendar datacadastro) {
		this.datacadastro = datacadastro;
	}
	
}
