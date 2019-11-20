               /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javathreads;

/**
 *
 * @author lil_ninja88
 */
class Interruption {
    void executeInterrupt() {
        System.out.println("This is the Interruption!");
        for(int item2=21;item2<41;item2++){
            System.out.println("Inserted Line Item "+item2);
        }
    }
}

public class Threads {

    public static void main(String[] args) {
        // This is what will be executed by the main thread
        // Threads are always executed in sequence
        
        // This is a job...
            System.out.println("This is a thread!");
            
        // This is the interruption request that will show sequence
        // The jobs below will be in the Waiting state
        Interruption interrupt = new Interruption();
        interrupt.executeInterrupt();
        
        // This is job number 2...
        for(int item=1;item<=20;item++){
            System.out.println("Line item #"+item);
        }
        
        // This is the final job in this thread...
            System.out.println("The thread has been completed");
    }
}
