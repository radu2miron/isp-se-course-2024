package edu.tucn.ispse.lecture9.ex2runnable;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        MyRunnable r2 = new MyRunnable();

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
