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
        for(int item2=1;item2<=20;item2++){
            System.out.println("Inserted Line Item "+item2);
        }
    }
}

class InterRequest extends Thread{
    @Override // Same operation, InterRequest is a Thread
    public void run() {
        for(int item3=1;item3<=10;item3++){
            System.out.println("InterRequest #"+item3+" Add");
        }
    }
}

class IRequest extends CA implements Runnable{
    @Override // Same operation, IRequest is a Thread
    public void run() {
        for(int item4=1;item4<=10;item4++){
            System.out.println("IRequest #"+item4+" Plus");
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
        
        Runnable ru = new InterRequest();        
        Thread request = new Thread(ru);
        request.start();
        
        // This is job number 2...
        for(int item=1;item<=15;item++){
            System.out.println("Line item #"+item);
        }
        
        // This calls the other runnable "sleep"
        sleep();
    
        // This is the final job in this thread...
            System.out.println("The thread has been completed");
        
        // This calls the executor
        executor();
        }
    
private static void executor() {
    {
    // Starts the Executor
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.submit(() -> {
    String threadName = Thread.currentThread().getName();
    for(int item=1;item<=5;item++){
        System.out.println("Start Executor "+threadName+" Line "+item);
        }
    System.out.println("Starting next " + threadName);
    
    // Shuts down the Executor
    executor.shutdownNow();
    });
    }
}
    
    private static void sleep() {
        // This is the runnable Sleep funtion
        Runnable runnable = () -> {
    try {
        String sleepy = Thread.currentThread().getName();
        System.out.println("Sleep Runner " + sleepy);
        // This time is in milliseconds and can be modified
        Thread.sleep(500);
        System.out.println("Last Sleep Runner " + sleepy);
        }
    // If the function faults, it will catch the Exception with this code
    catch (InterruptedException e) {
        e.printStackTrace();
        }};  
    Thread thread = new Thread(runnable);
    thread.start();
    }
}
