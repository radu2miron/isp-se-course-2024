package edu.tucn.ispse.lecture5.ex3anonymous.ex30;

/**
 * @author Radu Miron
 * @version 1
 */
public abstract class Bicycle {
    public abstract void move();
    public abstract void changeSpeed();

    public void spinWheel() {
        System.out.println("The wheel spins");
    }
}