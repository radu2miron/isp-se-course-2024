package edu.tucn.ispse.lecture9.ex3runnable;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        MyRunnable r2 = new MyRunnable();

       r1.start();
       r1.start();
    }
}
