package edu.tucn.ispse.lecture2.ex1;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.grow(1, 1);
        System.out.println(String.format("The tree is %d high and %d wide", tree1.getHeight(), tree1.getWidth()));

        Tree tree2 = new Tree(1, 1, 5, "Ionuț", "blue");
        Tree tree3 = new Tree(2, 1, 6, "Mariuța", "blue");
        Tree tree4 = tree2;
        tree2.grow(2, 2);
        System.out.println(tree4.getHeight());

        tree2.communicate(tree3);
        tree3.communicate(tree1);

        System.out.println("Number of created trees: " + Tree.getCounter());

        System.out.println(tree2.getName().toUpperCase());
        System.out.println(tree1.getName());
        System.out.println(tree1.getName().toUpperCase());// expected NPE
    }
}
