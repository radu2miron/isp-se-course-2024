package edu.tucn.ispse.lecture5.ex1interfaces;

/**
 * @author Radu Miron
 * @version 1
 */
public class Snake implements Animal{
    @Override
    public void eat() {
        System.out.println("The snake eats mice");
    }

    @Override
    public void sleep() {
        System.out.println("The snake sleeps with eyes open");
    }

    // override the default communicate implementation
    @Override
    public void communicate() {
        System.out.println("The snake communicates through pheromones");
    }
}
