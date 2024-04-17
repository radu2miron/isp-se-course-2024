package edu.tucn.ispse.lecture9.ex5interruptedexception;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        SleeperThread sleeperThread = new SleeperThread();
        sleeperThread.start();
        new InterrupterThread(sleeperThread).start();
    }
}
