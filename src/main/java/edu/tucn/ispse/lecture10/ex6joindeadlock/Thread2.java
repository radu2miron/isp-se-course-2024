package edu.tucn.ispse.lecture10.ex6joindeadlock;

/**
 * @author Radu Miron
 * @version 1
 */
public class Thread2 extends Thread {
    private Thread1 thread1;

    @Override
    public void run() {
        System.out.println("doing something");

        try {
            thread1.join();
        } catch (InterruptedException e) {
        }

        System.out.println("doing something else");
    }

    public void setThread1(Thread1 thread1) {
        this.thread1 = thread1;
    }
}
