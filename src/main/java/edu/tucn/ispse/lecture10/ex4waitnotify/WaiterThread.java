package edu.tucn.ispse.lecture10.ex4waitnotify;

/**
 * @author Radu Miron
 * @version 1
 */
public class WaiterThread extends Thread {
    public void run() {
        synchronized (Main.MONITOR) {
            try {
                Main.MONITOR.wait();
                // At this point this thread needs to get hold of the monitor.
                // It's like having the next instruction again: synchronized (Main.MONITOR) {
            } catch (InterruptedException e) {
            }
            System.out.println("I was notified");
        }
    }
}
