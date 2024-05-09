package edu.tucn.ispse.lecture10.ex11singleton;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        new Thread(() -> Singleton.getInstance()).start();
        new Thread(() -> Singleton.getInstance()).start();
        new Thread(() -> Singleton.getInstance()).start();
        new Thread(() -> Singleton.getInstance()).start();
    }
}
