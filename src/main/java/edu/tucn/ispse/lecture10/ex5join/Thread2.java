package edu.tucn.ispse.lecture10.ex5join;

/**
 * @author Radu Miron
 * @version 1
 */
public class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Thread 2: I'm done");
    }
}
