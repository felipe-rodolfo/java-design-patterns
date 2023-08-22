package br.com.felipe.store.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter{

    @Override
    public void post(String url, Map<String, Object> data) {
        try {
            URL ApiUrl = new URL(url);
            URLConnection connection = ApiUrl.openConnection();
            connection.connect();
        } catch (MalformedURLException e){
            throw new RuntimeException("Error to send HTTP request");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
