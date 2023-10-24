package com.cbfacademy;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class App {
    public static void main(String[] args) {

        try  {
            URL myUrl = new URL("https://codingblackfemales.com/academy");
            HttpURLConnection myUrlConnection = (HttpURLConnection) myUrl.openConnection();
            int responseCode = myUrlConnection.getResponseCode();

            System.out.println(String.format("Server returned HTTP response code: %d", responseCode));
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(myUrlConnection.getInputStream()))) {
                String line;
                    while((line =reader.readLine())!=null){
                    System.out.println(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
