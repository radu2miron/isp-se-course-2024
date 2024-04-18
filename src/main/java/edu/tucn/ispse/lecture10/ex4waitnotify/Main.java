package edu.tucn.ispse.lecture10.ex4waitnotify;

import java.io.IOException;

/**
 * @author Radu Miron
 * @version 1
 */

public class Main {
    static final Object MONITOR = new Object();

    public static void main(String[] args) throws IOException {
        new NotifierThread().start();
        new WaiterThread().start();
    }
}