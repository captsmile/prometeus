package net.proselite.core.notify;

/**
 * Created by Vitalii on 19.04.2017.
 */
public class ThreadsInteraction {
    boolean isActive = false;

    public synchronized void Request(String request){
        if(isActive){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Pilot:");
        System.out.println(request);
        isActive = true;
        notify();
    }

    public synchronized void Response(String response){
        if(!isActive){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("Controller:");
        System.out.println(response);
        isActive = false;
        notify();
    }
}
