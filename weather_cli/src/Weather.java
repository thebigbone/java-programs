import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import java.io.*;

import org.json.*;;

public class Weather {
    public static void main(String[] args) {
        String url = "https://duckduckgo.com";
        HttpGet req = new HttpGet(url);

        String output = req.toString();
        System.out.println(output);
    }
}