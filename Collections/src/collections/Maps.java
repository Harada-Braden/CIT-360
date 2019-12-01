/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author lil_ninja88
 */

/*******************************************************************************
* Maps are objects that map keys to values. While a Map does not extend the 
* Collection interface, it is used as but is not considered a true Collection.
* Characteristics and behaviors are also different from Collections in that Maps
* cannot contain duplicate keys and keys can only map to one value.
 ******************************************************************************/

public class Maps {
    static Map<Integer, String> names = new HashMap<Integer, String>();
    Iterator<Entry<Integer, String>> iterator = names.entrySet().iterator();
	
    // Initial creation of the Map
    public Maps() {
        names.put(0,"Daddy");
        names.put(10,"Mommy");
        names.put(20,"Son");
        names.put(30,"Daughter");
        names.put(40,"Uncle");
        names.put(50,"Aunt");
        System.out.println("A Map of Names has been created.");
        showNames();
    }
    
    // This Method starts the other Methods
    private static void executeMethods() {
        System.out.println("Attempt to search for Son.");
        searchNames("Son");
        System.out.println("Attempt to search for Baby.");
        searchNames("Baby");
        System.out.println("Clearing all names.");
        clearNames();
    }
        
    // This Method searches the Map for a Name
    private static void searchNames(String name) {
	if (names.containsValue(name)) {
            System.out.println("Name found! "+name+" exists.");
	} else {
            System.out.println("Name not found! "+name+" does not exist.");
	}	
	System.out.println();
    }
	
    // This Method displays the details of the Map
    public static void showNames() {
        for(Integer key: names.keySet())
        System.out.println(key+" - "+names.get(key));
        System.out.println();  
    }

    // This Method clears or deletes the contents of the Map
    public static void clearNames() {
        names.clear();
        System.out.println("All names cleared");
    }

    // This is the Main Method and calls the functions in order, from top to bottom
    public static void main(String[] args) {
        new Maps();
        executeMethods();
    }
}