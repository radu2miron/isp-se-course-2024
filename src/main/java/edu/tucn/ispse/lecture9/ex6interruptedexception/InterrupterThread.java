package edu.tucn.ispse.lecture9.ex6interruptedexception;

/**
 * @author Radu Miron
 * @version 1
 */
public class InterrupterThread extends Thread {
    private SleeperThread sleeperThread;

    public InterrupterThread(SleeperThread sleeperThread) {
        this.sleeperThread = sleeperThread;
    }

    @Override
    public void run() {
        System.err.println("I'll wait 5 sec then I'll interrupt the other thread");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        sleeperThread.interrupt();
    }
}
