package edu.tucn.ispse.lecture6.ex1collections.subex3map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Radu Miron
 * @version 1
 */
public class SameHash {
    public static void main(String[] args) {
        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());

        Map<String, String> testSameHash = new HashMap<>();
        testSameHash.put("Aa", "val1");
        testSameHash.put("BB", "val2");
        testSameHash.put("BB", "val3");

        System.out.println(testSameHash.get("Aa"));
        System.out.println(testSameHash.get("BB"));
    }
}
