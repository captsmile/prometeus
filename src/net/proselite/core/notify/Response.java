package net.proselite.core.notify;

/**
 * Created by Vitalii on 19.04.2017.
 */
public class Response implements Runnable {
    ThreadsInteraction interaction;
    String[] response =
            {
                    "Aeroflot 1816, Dnipro Radar, go ahead",
                    "Aeroflot 1816, descend to altitude 6,000 feet"
            };


    public Response(ThreadsInteraction interaction) {
        this.interaction = interaction;
        new Thread(this, "Response").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < response.length; i++) {
            interaction.Response(response[i]);
        }
    }
}
