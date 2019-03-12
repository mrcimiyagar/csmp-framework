package helpers;

import models.Pair;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LogHelper {

    private static BlockingQueue<Pair<String, String>> logs = new LinkedBlockingQueue<>();
    private static Thread runningThread;
    private static boolean alive = false;

    public static void start() {
        alive = true;
        runningThread = new Thread(() -> {
            try {
                while (alive) {
                    Pair<String, String> log = logs.take();
                    System.out.println(log.first + " : " + log.second);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        runningThread.start();
    }

    public static void stop() {
        alive = false;
        try {
            runningThread.interrupt();
        } catch (Exception ignored) {

        }
    }

    public static void log(String tag, String message) {
        logs.offer(new Pair<>(tag, message));
    }
}
