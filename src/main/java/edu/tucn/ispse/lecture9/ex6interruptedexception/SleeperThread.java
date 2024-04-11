package edu.tucn.ispse.lecture9.ex6interruptedexception;

/**
 * @author Radu Miron
 * @version 1
 */
public class SleeperThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("do something");
                Thread.sleep(24 * 60 * 60 * 1000); // 24h sleep
            }
        } catch (InterruptedException e) {
            System.out.println("The sleeper thread got interrupted!");
        }
    }
}
