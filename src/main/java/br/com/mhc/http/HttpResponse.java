package br.com.mhc.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

public class HttpResponse {

	public InputStream get(HttpURLConnection con) {
		try {
			return con.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
