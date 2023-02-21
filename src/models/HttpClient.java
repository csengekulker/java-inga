
/*
* File: HttpClient.java
* Author: Balogh Csenge
* Copyright: 2023, Balogh Csenge
* Group: Szoft_II_N
* Date: 2023-02-21
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

package models;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class HttpClient {
    int resCode;
    
    public HttpClient() {}

    public String get(String urlStr) {
        String result;
        try {
            result = tryGet(urlStr);
        } catch (IOException e) {
            result = e.getMessage();

            System.err.println(result);

        }

        return result;
    }

    public String tryGet(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();

        http.setRequestMethod("GET");
        http.connect();

        this.resCode = http.getResponseCode();
        InputStream stream = http.getInputStream();
        String text = convertStreamToString(stream);

        return text;
    }

    public String convertStreamToString(InputStream stream) throws UnsupportedEncodingException {
        StringBuilder builder = new StringBuilder();
        final Reader reader = new InputStreamReader(stream, "UTF-8");
        Scanner scanner = new Scanner(reader);

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine());

        }

        scanner.close();

        return builder.toString();
        
    }
} 
