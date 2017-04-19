package net.proselite.core.notify;

/**
 * Created by Vitalii on 19.04.2017.
 */
public class ThreadsInteractionDemo {
    public static void main(String[] args) {
        ThreadsInteraction interaction = new ThreadsInteraction();

        Request request = new Request(interaction);
        Response response = new Response(interaction);
    }
}
