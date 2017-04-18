package net.proselite.core.sync;

/**
 * Created by Vitalii on 18.04.2017.
 */
public class SimpleThread extends Thread{
    private Thread thread;
    private String threadName;
    Counter counter;

    public SimpleThread(String threadName, Counter counter) {
        this.threadName = threadName;
        this.counter = counter;
    }

    public void run(){
        System.out.println("Thread " + threadName + " is running...");
        counter.displayCounter();
        System.out.println("Leaving " + threadName + " thread...");
    }

    public void start(){
        System.out.println("Thread " + threadName + " is started.");
        if(thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
