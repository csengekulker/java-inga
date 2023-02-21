
/*
* File: RestApi.java
* Author: Balogh Csenge
* Copyright: 2023, Balogh Csenge
* Group: Szoft_II_N
* Date: 2023-02-21
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/


package models;

public class RestApi {
    
    public RestApi() {}

    public String getProperties() {
        HttpClient http = new HttpClient();
        String host = "http://[::1]:3000/";
        String endpoint = "properties";

        String urlStr = host + endpoint;

        String res = http.get(urlStr);

        System.out.println(res);

        return res;

        
    }
} 
