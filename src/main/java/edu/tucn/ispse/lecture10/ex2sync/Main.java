package edu.tucn.ispse.lecture10.ex2sync;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        new MyThread2().start();
        new MyThread2().start();
    }
}
