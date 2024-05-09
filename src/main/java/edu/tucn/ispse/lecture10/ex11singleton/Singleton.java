package edu.tucn.ispse.lecture10.ex11singleton;

/**
 * @author Radu Miron
 * @version 1
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }

        return instance;
    }
}
