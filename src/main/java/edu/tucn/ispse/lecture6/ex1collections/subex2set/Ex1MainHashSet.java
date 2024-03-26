package edu.tucn.ispse.lecture6.ex1collections.subex2set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author radumiron
 * @version 1
 */
public class Ex1MainHashSet {
    public static void main(String[] args) {
        // list
        List<Integer> integers = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5);
        System.out.println("list size: " + integers.size());

        System.out.println("list:");

        for (Integer i : integers) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();


        // set
        Set<Integer> uniqueIntegers = new HashSet<>(integers); // start with the list
        uniqueIntegers.add(1);
        uniqueIntegers.add(1);
        uniqueIntegers.add(2);
        uniqueIntegers.add(2);
        uniqueIntegers.add(3);

        System.out.println("set size: " + uniqueIntegers.size());
        System.out.println("set:");

        for (Integer i : uniqueIntegers) {
            System.out.print(i + " ");
        }
    }
}
