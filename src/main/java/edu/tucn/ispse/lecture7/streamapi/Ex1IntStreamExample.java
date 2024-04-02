package edu.tucn.ispse.lecture7.streamapi;

import java.util.Arrays;

/**
 * @author Radu Miron
 * @version 1
 */
public class Ex1IntStreamExample {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 1, 5, 6, 1, 2, 3, 4};

        int sum = Arrays.stream(array)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .sum();
        System.out.println(sum);

        System.out.println(Arrays.stream(array)
                .summaryStatistics()
                .toString());

        Arrays.stream(array)
                .distinct()
                .limit(5)
                .forEach(System.out::println);

        Arrays.stream(array)
                .sorted()
                .forEach(System.out::println);
    }
}
