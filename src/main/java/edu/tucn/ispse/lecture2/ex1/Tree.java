package edu.tucn.ispse.lecture2.ex1;

/**
 * @author Radu Miron
 * @version 1
 */
public class Tree {
    private static int counter = 0;

    // attributes
    private int height;
    private int width;
    private int numOfBranches;
    private String name;
    private String color;

    // constructors
    public Tree() {
        counter++;
    }

    public Tree(int height, int width) {
        this.height = height;
        this.width = width;
        counter++;
    }

    public Tree(int height, int width, int numOfBranches, String name, String color) {
        this.height = height;
        this.width = width;
        this.numOfBranches = numOfBranches;
        this.name = name;
        this.color = color;
        counter++;
    }

    // methods
    public void grow(int heightIncrement, int widthIncrement) {
        this.height = this.height + heightIncrement;
        this.width = this.width + widthIncrement;
    }

    public void communicate(Tree tree) {
        System.out.printf("Tree %s says hello to tree %s\n", this.name, tree.name);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }
}

