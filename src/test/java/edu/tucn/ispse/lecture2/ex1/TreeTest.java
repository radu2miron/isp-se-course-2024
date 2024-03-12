package edu.tucn.ispse.lecture2.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Radu Miron
 * @version 1
 */
public class TreeTest {
    @Test
    public void testGrow() {
        // test tree created with the no-arg constructor
        Tree tree = new Tree();
        tree.grow(1, 2);
        Assertions.assertEquals(1, tree.getHeight());
        Assertions.assertEquals(2, tree.getWidth());

        // test tree created with initialized size
        Tree tree1 = new Tree(2, 3);
        tree1.grow(2, 3);
        Assertions.assertEquals(4, tree1.getHeight());
        Assertions.assertEquals(6, tree1.getWidth());
    }
}
