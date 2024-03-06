package edu.tucn.ispse.lecture2.ex2;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = a; // assignment by value

        a++;++a;

        System.out.println(b);
    }
}
