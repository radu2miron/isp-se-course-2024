package edu.tucn.ispse.lecture7.streamapi;

import java.util.List;
import java.util.Optional;

/**
 * @author Radu Miron
 * @version 1
 */
public class Ex3Optional {
    public static void main(String[] args) {
        Optional<String> optional =
                List.of("abc", "efg", "hijkq", "lmno", "prstu").stream()
                        .filter(s -> s.length() > 4)
                        .findAny(); // or .findFirst()

        // further map and/or filter an optional
        Optional<Integer> optionalInt = optional.map(s -> s.hashCode());
        optional.ifPresent(System.out::println);
        Optional<Integer> optionalInt1 = optionalInt.filter(i -> i % 10 == 0);
        optionalInt1.ifPresentOrElse(i -> System.out.println(i * 2), () -> System.out.println("not found"));

        // if optional is empty provide an alternative
        String s1 = optional.orElse(":|");
        String s2 = optional.orElseGet(() -> {
            System.out.println("String not found, returning ':)'");
            return ":)";
        });
        String s3 = optional.orElseThrow(
                () -> new RuntimeException("String not found"));
        System.out.println(s1 + "-" + s2 + "-" + s3);

        // if optional is present do something with it
        optional.ifPresent(s -> System.out.println(s.length()));
        optional.ifPresentOrElse(System.out::println,
                () -> System.out.println("String not found"));

        // check if it's empty or present
        boolean empty = optional.isEmpty();
        boolean present = optional.isPresent();
        System.out.println("is empty?" + empty + "; is present?" + present);
    }
}
