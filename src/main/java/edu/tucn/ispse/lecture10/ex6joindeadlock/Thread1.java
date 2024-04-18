package edu.tucn.ispse.lecture10.ex6joindeadlock;

/**
 * @author Radu Miron
 * @version 1
 */
public class Thread1 extends Thread {
    private Thread2 thread2;

    public Thread1(Thread2 thread2) {
        this.thread2 = thread2;
    }

    @Override
    public void run() {
        System.out.println("doing something");

        try {
            thread2.join();
        } catch (InterruptedException e) {
        }

        System.out.println("doing something else");
    }
}
