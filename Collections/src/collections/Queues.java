/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author lil_ninja88
 */
public class Queues {
    static Queue<String> waitList = new LinkedList<>();
    Iterator<String> iterator = waitList.iterator();
    
    // Initial creation of the Queue
    public Queues() {
        waitList.add("Ronald");
        waitList.add("Ron");
        waitList.add("Ronny");
        waitList.add("Uncle Ron");
        waitList.add("Papa Ron");
        waitList.add("Little Ron");
        System.out.println("The Queue has been created!");
    }
    
    // This Method starts the other Methods
    private static void executeMethods() {
        System.out.println("Here is the current Queue!");
        showQueues();
        System.out.println("Attempting to find the first person...");
        firstLine();
        System.out.println();
        System.out.println("Attempting to find Uncle Ron in the Queue...");
        searchQueue("Uncle Ron");
        System.out.println();
        System.out.println("Attempting to find Brother Ron in the Queue...");
        searchQueue("Brother Ron");
        System.out.println();
    }
    
    // This Method displays the details of the Queue
    public static void showQueues() {
        for(Object object : waitList) {
            String element = (String) object;
            System.out.println(element);
        }
        System.out.println();
    }
    
    // This Method shows the first line of the Queue
    public static void firstLine() {
        System.out.println("The first person in the Queue is "+waitList.peek()+".");
    }
    
    // This Method searches the Queue for a specific value
    public static void searchQueue(String person) {
        System.out.println("Searching for "+person+" in the Queue.");
        if(waitList.contains(person)) {
            System.out.println("Found "+person+" in the Queue.");
        } else {
            System.out.println("Could not find "+person+" in the Queue.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    // This is the Main Method and calls the functions in order, from top to bottom
    public static void main(String[] args) {
        new Queues();
        executeMethods();
    }
    
}
