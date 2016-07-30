package br.com.mhc.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/** @auth Matheus Castiglioni
 *  Classe responsável por fazer uma requisição em determinada URL e devolver o conteúdo da página, ela pega todo o 
 *  page source e o retorna como String
 */
public class HttpRequest {
	
	private String urlRequest;
	private Properties parameters = new Properties();
	private Integer count = 0;
	private URL url;
	private HttpURLConnection connection;
	private BufferedReader br;
	private StringBuffer result = new StringBuffer(10000);
	private String response = "";
	
	public HttpRequest(String urlRequest) {
		// TODO Auto-generated constructor stub
		this.urlRequest = urlRequest;
	}
	
	private String getUrlRequest() {
		return urlRequest;
	}
	private void setUrlRequest(String urlRequest) {
		this.urlRequest = urlRequest;
	}
	public void setParameters(String key, String value) {		
		this.parameters.setProperty(key, value);
	}
	private Properties getParameters() {
		return parameters;
	}	
	private URL getURL() {
		try {
			return new URL(this.getUrlRequest());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	private HttpURLConnection getConnection() {
		return connection;
	}
	private void setConnection(HttpURLConnection connection) {
		this.connection = connection;
	}
	public StringBuffer getResult() {
		return result;
	}
	
	private void urlBuilder() {
		Iterator i = this.getParameters().keySet().iterator();
		while (i.hasNext()) {
			String key = (String) i.next();
			String value = this.getParameters().getProperty(key);
			this.setUrlRequest(this.getUrlRequest() + (++count == 1 ? "?" : "&") + key + "=" + value);
		}
	}
	
	private void connect() {
		try {
			this.setConnection((HttpURLConnection) this.getURL().openConnection()); 
			this.getConnection().setRequestProperty("Request-Method", "GET");
			this.getConnection().setDoInput(true);
			this.getConnection().setDoOutput(false);
			this.getConnection().connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getResponseRequest() throws IOException {
		this.urlBuilder();
		this.connect();
		this.br = new BufferedReader(new InputStreamReader(this.getConnection().getInputStream()));
		while(null != ((this.response = br.readLine()))) {
			this.response = this.response.trim();
			this.getResult().append(this.response);
		}
		this.br.close();
		return new String(this.getResult());
	}
	
}
