package edu.tucn.ispse.lecture10.ex1sync;

/**
 * @author Radu Miron
 * @version 1
 */
public class MyThread extends Thread {
    private Object lock;

    public MyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " do activity 1");

        synchronized (lock) {
            System.out.println(threadName + " do critical activity 2");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }

        System.out.println(threadName + " do activity 3");
    }
}
