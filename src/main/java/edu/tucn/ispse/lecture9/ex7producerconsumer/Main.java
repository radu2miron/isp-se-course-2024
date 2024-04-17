package edu.tucn.ispse.lecture9.ex7producerconsumer;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<File> arrayBlockingQueue = new ArrayBlockingQueue<>(100);
        Win win = new Win(arrayBlockingQueue);
        new FileProcessingThread(arrayBlockingQueue, "Consumer-1", win.getLogArea()).start();
        new FileProcessingThread(arrayBlockingQueue, "Consumer-2", win.getLogArea()).start();
    }
}
