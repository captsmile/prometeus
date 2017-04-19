package net.proselite.core.notify;

/**
 * Created by Vitalii on 19.04.2017.
 */
public class Request implements Runnable {
    ThreadsInteraction interaction;
    String[] request =
            {
                    "Dnipro Radar, Aeroflot 1816",
                    "Request descent, Aeroflot 1816",
                    "Descending to altitude 6,000 feet, Aeroflot 1816"
            };

    public Request(ThreadsInteraction interaction) {
        this.interaction = interaction;
        new Thread(this, "Request").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < request.length; i++) {
            interaction.Request(request[i]);
        }
    }
}
