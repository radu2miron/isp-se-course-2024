package edu.tucn.ispse.lecture6.ex1collections.subex4queue;

import java.util.ArrayDeque;

/**
 * @author radumiron
 * @version 1
 */
public class LIFOExample {
    public static void main(String[] args) {
        ArrayDeque<String> lifo = new ArrayDeque<>();
        lifo.offerFirst("1");
        lifo.offerFirst("1");
        lifo.offerFirst("2");
        lifo.offerFirst("3");

        int lifoSize = lifo.size();

        for (int i = 0; i < lifoSize; i++) {
            System.out.println(lifo.pop());
        }
    }
}
