/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author lil_ninja88
 */

/* 
 * This Main class displays the HTML Document from a URL.
 * This does not check for a valid connection or manage the HTTP requests,
 * and it will not provide a clean connect() or disconnect() method.
 */

public class ReadWebPage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Read from a website
            URL url = new URL("https://www.forbes.com");
            
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            
            // Read each line as long as line is not null and display it on the screen
            String line = "";
            while (line != null) {
                line = inputStream.readLine();
                System.out.println(line);
            }
            inputStream.close(); // close the stream
            
            // Use an exception in case there's an error
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
    
}
