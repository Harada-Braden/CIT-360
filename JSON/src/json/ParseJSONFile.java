/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author lil_ninja88
 */

/* 
 * This Class reads and parses a .json file.
 * The file is then displayed for the user.
*/ 

public class ParseJSONFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // parsing file "ParseFile.json"
        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\lil_n\\Documents\\Braden\\BYU-I\\CIT 360\\JSON\\Information.json"));

        // typecasting obj to JSONObject
        JSONObject jObject = (JSONObject) obj;

        // getting firstName and lastName
        String fName = (String) jObject.get("fName");
        String lName = (String) jObject.get("lName");

        System.out.println("First Name: " + fName);
        System.out.println("Last Name: " + lName);

        // getting age
        long age = (long) jObject.get("age");
        System.out.println("Age: " + age);

        // getting address
        Map address = ((Map) jObject.get("address"));
        System.out.println("Address: ");

        // iterating address Map
        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println("\t" + pair.getKey() + " : " + pair.getValue());
        }

        // getting phoneNumbers
        JSONArray jArray = (JSONArray) jObject.get("phoneNumbers");
        System.out.println("Phone Numbers: ");

        // iterating phoneNumbers
        Iterator itr2 = jArray.iterator();

        while (itr2.hasNext()) {
            itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println("\t" + pair.getKey() + " : " + pair.getValue());
            }
        }
    }
}
