package edu.tucn.ispse.lecture6.ex1collections.subex3map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * @author radumiron
 */
public class Ex1SimpleDictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        int choice;
        Scanner scanner = new Scanner(in);

        do {
            System.out.println("1. Add\n2. Find\n3. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("word:");
                    String word = readLine();

                    System.out.println("definition:");
                    String definition = readLine();

                    dictionary.put(word, definition);
                    System.out.println(word + " has been added to the dictionary");

                    break;
                case 2:
                    System.out.println("search for:");
                    word = readLine();
                    System.out.println("definition:" + dictionary.get(word));

                    break;
            }
        } while (choice != 3);
    }

    public static String readLine(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
