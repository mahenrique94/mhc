package br.com.mhc.cript;

import org.bouncycastle.util.encoders.Base64;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TesteBase64 {

    public static void main(String[] args) {
        String token = "MTMyNTk1MjU4MzE6MDkyMjkxNDQwMDAxOTk6MjAxNzA4MTUwMjUzMzM=";
        byte[] bytes = Base64.decode(token);
        try {
            System.out.println(Arrays.asList(new String(bytes, "utf8").split(":")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
