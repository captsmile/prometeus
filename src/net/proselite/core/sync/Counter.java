package net.proselite.core.sync;

/**
 * Created by Vitalii on 18.04.2017.
 */
public class Counter {
    public void displayCounter(){
        try {
            for(int i = 1; i<=5; i++){
                System.out.println("Counter: " + i);
            }
        }catch (Exception e){
            System.out.println("Thread is interrupted.");
        }
    }
}
