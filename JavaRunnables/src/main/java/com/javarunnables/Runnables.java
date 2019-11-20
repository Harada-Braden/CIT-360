/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarunnables;

/**
 *
 * @author lil_ninja88
 */
class CA{
    
}

class IRequest extends CA implements Runnable{
    @Override // Same operation, IRequest is a Thread
    public void run() {
        for(int item2=1;item2<=20;item2++){
            System.out.println("Line item #"+item2+" Extended");
        }
    }
}

public class Runnables {

    public static void main(String[] args) {
        // This is what will be executed by the main thread
        // Threads are always executed in sequence
        
        // This is the first job...
            System.out.println("This is a thread!");
            
        Runnable r = new IRequest();        
        Thread req = new Thread(r);
        req.start();
        // IRequest is not interrupting the operation of the Main
        
        // This is job number 2...
        for(int item=1;item<=20;item++){
            System.out.println("Line item #"+item);
        }
        
        // This is the final job in this thread...
            System.out.println("The thread has been completed");
    }
}