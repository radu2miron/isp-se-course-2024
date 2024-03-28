package edu.tucn.ispse.lecture6.ex2exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

/**
 * @author radumiron
 * @version 1
 * <p>
 * We'll try to read a file that doesn't exist
 */
public class Ex1CheckedExceptionExample {
    public static void main(String[] args) {
        String fileName = UUID.randomUUID().toString(); // obviously, this file doesn't exist
        try {
            Files.lines(Paths.get(fileName)) // <=> Files.readAllLines(Paths.get(fileName)).stream()
                    .forEach(l -> System.out.println(l));
        } catch (IOException e) {
            // 'catch' lets you decide what to do if an error occurs
            // for instance we can try reading a file given by the user
            System.err.println(fileName + " doesn't exist!"); // or: e.printStackTrace();
            // todo: HOMEWORK - implement the logic for giving the application an existing file; read it and print its lines
        }
    }
}
