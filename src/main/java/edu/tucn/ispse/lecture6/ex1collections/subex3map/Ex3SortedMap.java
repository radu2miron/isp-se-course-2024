package edu.tucn.ispse.lecture6.ex1collections.subex3map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author radumiron
 * @version 1
 */
public class Ex3SortedMap {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("BB", "definition1");
        dictionary.put("Aa", "definition2");
        dictionary.put("T", "definition3");
        dictionary.put("CDE", "definition4");
        dictionary.put("1", "definition5");
        dictionary.put("2", "definition6");
        System.out.println("Dictionary with HashMap:");
        dictionary.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println();

        Map<String, String> sortedDictionary = new TreeMap();
        sortedDictionary.putAll(dictionary);

        System.out.println("Dictionary with TreeMap:");

        for (Map.Entry<String, String> kv : sortedDictionary.entrySet()) {
            System.out.println(kv.getKey() + ": " + kv.getValue());
        }
    }
}
