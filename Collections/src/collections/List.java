/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Collections;

/**
 *
 * @author lil_ninja88
 */

/*******************************************************************************
* Lists are a type of Collection that can have null and repetitive items. These 
* items are stored in the order they are added to the List. Lists can also store
* objects of any type.
 ******************************************************************************/

public class List {
    static ArrayList<String> myDinosaurs = new ArrayList<String>();

    private static void sort(ArrayList<String> list) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    // Initial creation of the List
    public List() {
        myDinosaurs.add("Eoraptor");
        myDinosaurs.add("Ankylosaurus");
        myDinosaurs.add("TyrannosaurusRex");
        myDinosaurs.add("Velociraptor");
        myDinosaurs.add("Utahraptor");
        myDinosaurs.add("Parasaurolophus");
        myDinosaurs.add("Stegosaurus");
        myDinosaurs.add("Triceratops");
        myDinosaurs.add("Brachiosaurus");
        myDinosaurs.add("Pteranodon");
        System.out.println("Dino's have been created!");
    }

    // This Method starts the other Methods
    private static void executeMethods() {
        System.out.println("A new egg hatched!");
        addDinosaur("Indoraptor!");
        System.out.println("Removing a Dinosaur.");
        removeDinosaur(6);
        System.out.println("Trying to remove a dinosaur again.");
        removeDinosaur(10);
        System.out.println("Time to sort the Dinosaurs!");
        sortDinosaurs(myDinosaurs);
        System.out.println("Removing all dinosaurs.");
        clearDinosaurs();
    }
    
    // This Method adds another value to the List
    private static void addDinosaur(String breed) {
        myDinosaurs.add(breed);
        showDinosaurs();
        System.out.println();
    }
    
    // This Method removes a specific item from the List
    private static void removeDinosaur(int place) {
        int location = place;
        try {
            if(myDinosaurs.size()==0)
                throw new Exception();
            else {
                System.out.println("Location "+location+" containing "
                        +myDinosaurs.get(location)+" will now be removed!");
                myDinosaurs.remove(location);
                showDinosaurs();
            }
        }
        catch (Exception other) {
            System.out.println("Dinosaur at specified location "
                    +location+" is not present.");
        }
        System.out.println();
    }
    
    // This Method sorts the List
    private static void sortDinosaurs(ArrayList<String> list) {
        try {
            if(list.size()==0)
                throw new EmptyStackException();
            else {
                Collections.sort(list);
                showDinosaurs();
                System.out.println();
            }
        }
        catch (EmptyStackException e) {
        }
    }
    
    // This Method clears or deletes the contents of the List
    private static void clearDinosaurs() {
        try {
            if(myDinosaurs.size()==0)
                throw new EmptyStackException();
            else {
                myDinosaurs.clear();
                showDinosaurs();
            }
        }
        catch (EmptyStackException e) {   
        }
        System.out.println("All dinosaurs have been removed. \n");
    }
    
    // This Method displays the contents of the List
    public static void showDinosaurs() {
        Object dino;
        try {
            if(myDinosaurs.size()==0)
                throw new EmptyStackException();
            else {
                for(int i=0;i<=myDinosaurs.size()-1;i++) {
                    dino = myDinosaurs.get(i);
                    if(dino!=null)
                        System.out.println(dino+" at specified location "+i);
                }
            }
        }
        catch(EmptyStackException e){
        }
    }
    
    // This is the Main Method and calls the functions in order, from top to bottom
    public static void main(String[] args) {
        new List();
        executeMethods();   
    }
}
