package edu.tucn.ispse.lecture7.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Radu Miron
 * @version 1
 */
public class Ex2StreamExample {
    public static void main(String[] args) throws IOException {
        // filter -> map -> collect to a list
        List<String> names = Stream.of("Ana", "John", "Bella", "Zack", "Zoe", "Petru")
                .filter(name -> name.length() > 3)
                .map(name -> name.toUpperCase())
                .toList();
        System.out.println(names);

        // filter -> map -> collect joining
        List<String> carBrands = Arrays.asList("Dacia", "ARO", "BMW", "Renault", "Alfa Romeo", "Bugatti");
        String cbJoined = carBrands.stream()
                .filter(cb -> cb.length() <= 7)
                .map(cb -> "[" + cb + "]")
                .collect(Collectors.joining("_"));
        System.out.println(cbJoined);

        // read each line -> convert it to char array -> flat map -> collect to a char frequency map
        Map<Character, Long> characterFrequency =
                Files.lines(Path.of("testfiles/lore_ipsum.txt"))
                        .map(line -> line.chars())
                        .flatMap(intStream -> intStream.mapToObj(i -> (char) i))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characterFrequency);
    }
}
