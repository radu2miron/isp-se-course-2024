package edu.tucn.ispse.lecture10.ex1sync;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        Object lock = new Object();
        new MyThread(lock).start();
        new MyThread(lock).start();
    }
}
