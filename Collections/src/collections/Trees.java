/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author lil_ninja88
 */

/*******************************************************************************
* TreeSets implement the Set interface but this example also implements the 
* SortedSet interface. This sorts elements by the natural order or by a 
* specified comparator.
 ******************************************************************************/

public class Trees {
    static TreeSet<Integer> setNumbers = new TreeSet<Integer>();
    static Iterator<Integer> iterator = setNumbers.iterator();
    
    // Initial creation of the Tree
    public Trees() {
        setNumbers.add(3);
        setNumbers.add(1);
        setNumbers.add(4);
        setNumbers.add(2);
        setNumbers.add(7);
        setNumbers.add(5);
        setNumbers.add(8);
        setNumbers.add(6);
        setNumbers.add(0);
        setNumbers.add(9);
        System.out.println("Numbers have been added to the Tree");
        System.out.println();
    }
    
    // This Method starts the other Methods
    private static void executeMethods() {
        originalSet();
        firstSet();
        lastSet();
        middleSet();
        headSet();
        tailSet();
        runCompare();
        System.out.println();
        System.out.println("Adding number 10 to the TreeSet.");
        addNumber(10);
        System.out.println("Deleting number 4 from the TreeSet.");
        deleteNumber(4);
        System.out.println("Attemping to delete number 4 again.");
        deleteNumber(4);
        System.out.println();
        System.out.println("Clearing the Treeset.");
        clearNumbers();
        System.out.println("Attempting to clear the TreeSet again.");
        clearNumbers();
    }
    
    // This Method displays the TreeSet
    private static void originalSet() {
        System.out.println("Original Set: "+setNumbers);
    }
    
    // This Method displays the first number
    private static void firstSet() {
        Integer first = setNumbers.first();
        System.out.println("First element: "+first);
    }
    // This Method displays the last number
    private static void lastSet() {
        Integer last = setNumbers.last();
        System.out.println("Last element: "+last);
    }
    
    // This Method displays the middle numbers
    private static void middleSet() {
        SortedSet<Integer> subSet = setNumbers.subSet(3, 7);
        System.out.println("Sub Set: "+subSet);
    }
    
    // This Method displays the first set of numbers
    private static void headSet() {
        SortedSet<Integer> headSet = setNumbers.headSet(5);
        System.out.println("Head Set: "+headSet);
    }
    
    // This Method displays the last set of numbers
    private static void tailSet() {
        SortedSet<Integer> tailSet = setNumbers.tailSet(5);
        System.out.println("Tail Set: "+tailSet);
    }
    
    // This Method displays the results of the Comparator
    private static void runCompare() {
        Comparator comparator = setNumbers.comparator();
        System.out.println("Sorted by natural ordering? "+(comparator == null));
    }
    
    // This Method displays the details of the TreeSet
    private static void showNumbers() {
        iterator = setNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" ");
        }
        originalSet();
        System.out.println();
    }
    
    // This Method adds another value to the TreeSet
    private static void addNumber(Integer newNumber) {
        setNumbers.add(newNumber);
        System.out.println("Number "+newNumber+" has been added.");
        showNumbers();
    }
    
    // This Method removes a specific item from the TreeSet
    private static void deleteNumber(Integer deletion) {
        if(setNumbers.contains(deletion)) {
            setNumbers.remove(deletion);
            System.out.println(deletion+" has been deleted.");
            showNumbers();
        } else {
            System.out.println(deletion+" is not present in the TreeSet.");
        }
    }
    
    // This Method clears or deletes the contents of the TreeSet
    private static void clearNumbers() {
        try {
            if(setNumbers.size()==0)
                throw new EmptyStackException();
            else {
                setNumbers.removeAll(setNumbers);
                System.out.println("The TreeSet has been cleared!");
                showNumbers();
            }
        } catch (EmptyStackException e) {
            System.out.println("Error 404: Numbers not found.");
        }
    }

    /**
     * @param args the command line arguments
     */
    
    // This is the Main Method and calls the functions in order, from top to bottom
    public static void main(String[] args) {
        new Trees();
        executeMethods();
    }
    
}
