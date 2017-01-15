package br.com.mhc.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@NamedNativeQuery(
	name = "buscaPessoa",
	query = "select pes.* from pessoa pes where datacadastro >= ?0 and datacadastro <= ?1",
	resultClass = Pessoa.class
)
@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable, Cloneable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer idade;
	private String sexo;
	private Calendar datacadastro;
	List<PessoaEndereco> enderecos;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
		setDatacadastro(Calendar.getInstance());
	}
	public Pessoa(String nome) {
		// TODO Auto-generated constructor stub
		setNome(nome);
	}
	public Pessoa(Integer id, String nome, Integer idade, String sexo, Calendar datacadastro) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.datacadastro = datacadastro;
	}
	public Pessoa(Integer id, String nome, Integer idade, String sexo, Calendar datacadastro, List<PessoaEndereco> enderecos) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.datacadastro = datacadastro;
		this.enderecos = enderecos;
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
	public List<PessoaEndereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<PessoaEndereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
}
