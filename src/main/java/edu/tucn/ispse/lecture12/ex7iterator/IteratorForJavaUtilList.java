package edu.tucn.ispse.lecture12.ex7iterator;

import java.util.Arrays;
import java.util.List;

/**
 * @author Radu Miron
 */
public class IteratorForJavaUtilList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Marry", "Egbert");
        java.util.Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
