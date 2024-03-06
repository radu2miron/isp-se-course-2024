package edu.tucn.ispse.lecture1;

import java.util.Scanner;

/**
 * @author Radu Miron
 * @version 1
 * <p>
 * Simple(st) example.
 */
public class Main { // All Java code has to be written inside a class
    public static void main(String[] args) { // the main method is the place where the execution of the application starts
        Scanner scanner = new Scanner(System.in); // create a scanner used from reading from the console

        System.out.println("Your name: "); // print "Your name: " message in the console
        String name = scanner.nextLine(); // read the input from the console

        System.out.printf("Hello %s!", name); // print greeting in the console
    }
}