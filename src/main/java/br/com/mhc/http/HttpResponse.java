package br.com.mhc.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

public class HttpResponse {

	public InputStream get(HttpURLConnection con) throws IOException {
		return con.getInputStream();
	}
	
}
