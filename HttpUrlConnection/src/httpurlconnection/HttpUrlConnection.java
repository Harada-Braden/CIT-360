/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnection;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 *
 * @author lil_ninja88
 */

/* 
 * This Main class displays Header information for an HTTP URL.
 */

public class HttpUrlConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            URL obj = new URL("http://www.forbes.com");
            URLConnection connObj = obj.openConnection();
                        
            // Retrieve all the header information for the URL
            Map<String, List<String>> map = connObj.getHeaderFields();
 
            System.out.println("Printing All Response Header for URL: " + obj.toString() + "\n");
            
            // Display each item in the header fields
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
		
            // Display the length of the header content
            List<String> contentLength = map.get("Content-Length");
            if (contentLength == null) {
		System.out.println("'Content-Length' is not in the URL Header!");
            } else {
                for (String header : contentLength) {
                    System.out.println("Content-Lengtht: " + header);
		}
            }
 	} catch (Exception e) {
            e.printStackTrace();
	}
    }
    
}