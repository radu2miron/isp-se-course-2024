package edu.tucn.ispse.lecture10.ex6joindeadlock;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();
        Thread1 thread1 = new Thread1(thread2);

        thread2.setThread1(thread1);

        thread1.start();
        thread2.start();
    }
}
