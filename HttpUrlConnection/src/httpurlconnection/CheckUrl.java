/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author lil_ninja88
 */

/*
 *  This class will check the status of a URL. It returns "Good!" if up and "Bad!" if unreachable.
 *  I set some URLs to non-existent sites to demonstrate failed attempts to reach a URL.
 */

public class CheckUrl {
    public static void main(String args[]) throws Exception {
        String[] hostList = { "https://www.forbes.com", "https://www.msn.com",
                "https://www.weather.com", "https://www.disney.com", 
                "http://www.bradenharada.com", "https://www.menshealth.com",
                "http://www.dudethatsucks.com", "http://www.gibberish.com",
                "https://www.hallmark.com", "https://www.fandango.com",
                "https://www.hallmarkchannel.com", "https://www.churchofjesuschrist.org"};
        for (int i = 0; i < hostList.length; i++) {
            String url = hostList[i];
            String status = getURLStatus(url);
            System.out.println(url + "\t\tStatus:" + status);
        }
    }
 
    public static String getURLStatus(String url) throws IOException {
        String result = "";
        try {
            // Create a new HttpURL object
            URL siteURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) siteURL
                    .openConnection();
            
            // Initialize the method to GET or retrieve information from the URL
            connection.setRequestMethod("GET");
            
            // Initialize the connection to the URL
            connection.connect();
 
            // Check the response code to see if it successfully connected to the URL
            int code = connection.getResponseCode();
            
            // A return code of 200 means the URL was successfully reached
            if (code == 200) {
                result = "Good!";
            }
            
            // Terminate the HTTP URL connection and release its resources
            connection.disconnect();
        } catch (Exception e) {
            result = "*->BAD!<-*";
        }
        return result;
    }
}