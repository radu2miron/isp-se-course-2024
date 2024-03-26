package edu.tucn.ispse.lecture6.ex1collections.subex4queue;

import java.util.LinkedList;

/**
 * @author radumiron
 * @version 1
 */
public class FIFOExample {
    public static void main(String[] args) {
        LinkedList<String> fifo = new LinkedList<>();
        fifo.offer("1");
        fifo.offer("1");
        fifo.offer("2");
        fifo.offer("3");

        int fifoSize = fifo.size();

        for (int i = 0; i < fifoSize; i++) {
            System.out.println(fifo.pop());
        }
    }
}
