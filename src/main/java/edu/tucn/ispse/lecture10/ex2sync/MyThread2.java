package edu.tucn.ispse.lecture10.ex2sync;

/**
 * @author Radu Miron
 * @version 1
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " do activity 1");

        synchronized (MyThread2.class) {
            System.out.println(threadName + " do critical activity 2");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }

        System.out.println(threadName + " do activity 3");
    }
}
