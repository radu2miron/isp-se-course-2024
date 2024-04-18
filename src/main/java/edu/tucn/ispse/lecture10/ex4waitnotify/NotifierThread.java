package edu.tucn.ispse.lecture10.ex4waitnotify;

/**
 * @author Radu Miron
 * @version 1
 */
public class NotifierThread extends Thread {
    public void run() {
        try {
            System.out.println("Lets make the waiter wait");
            Thread.sleep(2000);

            synchronized (Main.MONITOR) { // uses the same instance
                Main.MONITOR.notify();
                System.out.println("The waiter will wait for the next sleep. " +
                        "I'm still holding the lock (still in 'synchronized')");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
        }
    }
}
