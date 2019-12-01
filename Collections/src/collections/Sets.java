/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collections;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author lil_ninja88
 */

/*******************************************************************************
* Sets do not allow duplicate elements and the elements are not stored in order.
* Sets are widely used when the user does not care about the order of elements
* and requires unique elements.
 ******************************************************************************/

public class Sets {
    static Set<Integer> numbers = new HashSet<>();
    static Iterator<Integer> iterator = numbers.iterator();
    
    // Initial creation of the Set
    public Sets() {
        numbers.add(0);
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);
        numbers.add(50);
        System.out.println("The Set for Numbers has been initialized.");
    }
    
    // This Method starts the other Methods
    private static void executeMethods() {    
        System.out.println("Here is the Set.");
        showNumbers();
	System.out.println("Adding 55 to the numbers Set.");
	addNumber(55);
        System.out.println("Attempting to add 55 to the numbers Set again.");
        addNumber(55);
        System.out.println("Attempt to delete a non-existing number.");
	deleteNumber(100);
        System.out.println("Deleting a number.");
	deleteNumber(20);
        System.out.println("Deleting the Set");
	clearNumbers();
        System.out.println("Verifying the Set was deleted successfully...");
	clearNumbers();
    }
    
    // This Method adds another value into the Set
    private static void addNumber(int newNumber) {
	if (!numbers.add(newNumber)) {
            System.out.println("Failed! "+newNumber+" already exists in the Set.");
	} else {
            numbers.add(newNumber);
	}
	showNumbers();
    }
    
    // This Method removes a specific item from the Set
    public static void deleteNumber(int delete) {
        System.out.println("Attempting to delete "+delete+".");
        if (numbers.contains(delete)) {
            numbers.remove(delete);
            System.out.println("Success! "+delete+" has been deleted.");
            showNumbers();
        } else {
            System.out.println("Attempt failed! "+delete+" is not a listed number.");
        }	
        System.out.println();
    }
	
    // This Method clears or deletes the contents of the Set
    public static void clearNumbers() {
        System.out.println("Clearing numbers.");
            try {
                if(numbers.isEmpty())
                throw new EmptyStackException();
            else {
                numbers.clear();
                System.out.println("Numbers have been cleared.");
                showNumbers();
            }
            } catch (EmptyStackException e) {
                System.out.println("Failed! No data found.");
            }
        System.out.println();
    }
        
    // This Method displays the contents of the Set
	public static void showNumbers() {
            iterator = numbers.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next()+" ");
            }
            System.out.println();
	}
        
    /**
     * @param args the command line arguments
     */
        
    // This is the Main Method and calls the functions in order, from top to bottom
    public static void main(String[] args) {
        new Sets();
        executeMethods();
    }
}