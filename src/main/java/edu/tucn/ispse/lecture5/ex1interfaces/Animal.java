package edu.tucn.ispse.lecture5.ex1interfaces;

/**
 * @author Radu Miron
 * @version 1
 */
public interface Animal {
    // attributes declared in interfaces are constants (public, static and final)
    boolean BREATHS_AIR = true;

    // abstract methods
    void eat();

    void sleep();

    // default method
    default void communicate() {
        System.out.println("It communicates through sounds");
    }

    // static method
    static void livesOn() {
        System.out.println("All animals live on Earth");
    }
}
