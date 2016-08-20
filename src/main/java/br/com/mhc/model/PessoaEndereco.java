package br.com.mhc.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa_endereco")
public class PessoaEndereco implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "idpessoa", referencedColumnName = "id", nullable = false)
	private Pessoa idpessoa;
	private String endereco;
	private Calendar datacadastro;
	
	public PessoaEndereco(Integer id, Pessoa idPessoa, String endereco, Calendar datacadastro) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.idpessoa = idPessoa;
		this.endereco = endereco;
		this.datacadastro = datacadastro;
	}
	public PessoaEndereco() {
		// TODO Auto-generated constructor stub
		setDatacadastro(Calendar.getInstance());
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Pessoa getIdpessoa() {
		return idpessoa;
	}
	public void setIdpessoa(Pessoa idpessoa) {
		this.idpessoa = idpessoa;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Calendar getDatacadastro() {
		return datacadastro;
	}
	public void setDatacadastro(Calendar datacadastro) {
		this.datacadastro = datacadastro;
	}

}
