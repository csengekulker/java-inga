package models;

public class RestApi {
    
    public RestApi() {}

    public void getProperties() {
        HttpClient http = new HttpClient();
        String host = "http://[::1]:3000/";
        String endpoint = "properties";

        String urlStr = host + endpoint;

        String res = http.get(urlStr);

        System.out.println(res);

        
    }
} 
