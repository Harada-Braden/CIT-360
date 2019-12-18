/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 *
 * @author lil_ninja88
 */

/* 
 * This Main class establishes an Http Url Connection, reads the contents of a
 * webpage, parses the data and displays it, then it disconnects from the site.
 * This will also check for a valid connection and manage HTTP GET requests
 * and provides a clean connect() and disconnect() method.
 */

public class HttpUrlRequest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creates and initialize all variables so they can be reinitialized later
        HttpURLConnection urlConnObj = null;
        BufferedReader rd  = null;  
        StringBuilder sb = null;      
        OutputStreamWriter wr = null;
        String line = null;
        
        try {
            URL serverAddress = new URL("https://www.forbes.com");
          
            // Sets up the initial connection
            urlConnObj = (HttpURLConnection) serverAddress.openConnection();
          
            // Sets the method to retrieve information from the URL
            urlConnObj.setRequestMethod("GET");
          
            urlConnObj.setDoOutput(true);
          
            // Sets a timeout in case the read operation takes too long
            urlConnObj.setReadTimeout(5000);
                    
            // Connects to the HTTP URL
            urlConnObj.connect();
        
            // Reads the result from the server
            rd  = new BufferedReader(new InputStreamReader(urlConnObj.getInputStream()));
            sb = new StringBuilder();
        
            while ((line = rd.readLine()) != null) {
                sb.append(line + '\n');
            }
            System.out.println(sb.toString());
            
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //close the connection, set all objects to null
            urlConnObj.disconnect();
            rd = null;
            sb = null;
            wr = null;
            urlConnObj = null;
        }
    }
}
