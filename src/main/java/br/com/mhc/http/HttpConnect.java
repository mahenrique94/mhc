package br.com.mhc.http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnect {

	public HttpURLConnection connect(String target) {
		try {
			URL url = new URL(target);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestProperty("Request-Method", "GET");
			con.setDoInput(true);
			con.setDoOutput(false);
			con.connect();
			return con;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
