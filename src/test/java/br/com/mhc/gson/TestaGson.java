package br.com.mhc.gson;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.mhc.model.Pessoa;

public class TestaGson {

	public static void main(String[] args) {
		String json = "{id : 1, nome : \"Matheus\", idade : 22, sexo : \"M\"}";
		Gson gson = new Gson();
		XStream xstream = new XStream();
		Pessoa pessoa = gson.fromJson(json, Pessoa.class);
		String xml = xstream.toXML(pessoa);
		System.out.println(pessoa.getNome());
		System.out.println(xml);
	}
	
}
