package edu.tucn.ispse.lecture5.ex4lambdas.ex40;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        // anonymous implementation for Performer
        Performer implementation1 = new Performer() {
            @Override
            public int performOperation(String param) {
                return param.compareTo("a");
            }
        };
        System.out.println(implementation1.performOperation("b")); // 1 ("b" > "a")

        // lambda expression for Performer implementation
        Performer implementation2 = param -> param.length();
        System.out.println(implementation2.performOperation("abdefg")); // 6

        Performer implementation3 = s -> s.indexOf("!");
        System.out.println(implementation3.performOperation("abc!efg!"));
    }
}

@FunctionalInterface
interface Performer {
    int performOperation(String param);
}
