package edu.tucn.ispse.lecture6.ex1collections.subex3map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Radu Miron
 */
public class Ex4AdditionOrderMap {
    public static void main(String[] args) {
        Map<String, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put("C", "test1");
        linkedMap.put("A", "test2");
        linkedMap.put("D", "test3");
        linkedMap.put("B", "test4");

        linkedMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
