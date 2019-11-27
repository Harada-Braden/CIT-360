/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsrunnersandexecutables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author lil_ninja88
 */

class CA {
}

class Interruption {
    void executeInterrupt() {
        System.out.println("This is the Interruption!");
        for(int item2=1;item2<21;item2++){
            System.out.println("Inserted Line Item "+item2);
        }
    }
}

class InterRequest extends Thread{
    @Override // Same operation, IRequest is a Thread
    public void run() {
        for(int item3=1;item3<=30;item3++){
            System.out.println("Line item #"+item3+" Extended");
        }
    }
}

class IRequest extends CA implements Runnable{
    @Override // Same operation, IRequest is a Thread
    public void run() {
        for(int item4=1;item4<=20;item4++){
            System.out.println("Line item #"+item4+" Extended");
        }
    }
}

public class ThreadsRunnersAndExecutables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is what will be executed by the main thread
        // Threads are always executed in sequence
        
        // This is a job...
            System.out.println("This is a thread!");
            
        // This is the interruption request that will show sequence
        // The jobs below will be in the Waiting state
        Interruption interrupt = new Interruption();
        interrupt.executeInterrupt();
        
        // This is the Runnable portion
        Runnable r = new IRequest();        
        Thread req = new Thread(r);
        req.start();
        
        // This is job number 2...
        for(int item=1;item<=15;item++){
            System.out.println("Line item #"+item);
        }
        
        // This is the final job in this thread...
            System.out.println("The thread has been completed");
    sleep();
    executor();
    }
    
private static void executor() {
    {
    // Starts the Executor
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.submit(() -> {
    String threadName = Thread.currentThread().getName();
    System.out.println("Starting next " + threadName);
    
    // Shuts down the Executor
    executor.shutdownNow();
    }
    );
    
}
    
}
    
    private static void sleep() {
        // This is the Sleep funtion
        Runnable runnable = () -> {
    try {
        String name = Thread.currentThread().getName();
        System.out.println("Second " + name);
        // This time is in milliseconds and can be modified
        Thread.sleep(500);
        System.out.println("Third " + name);
    }
    // If the function faults, it will catch the Exception with this code
    catch (InterruptedException e) {
        e.printStackTrace();
    }
};  

Thread thread = new Thread(runnable);
thread.start();
}
    
}
