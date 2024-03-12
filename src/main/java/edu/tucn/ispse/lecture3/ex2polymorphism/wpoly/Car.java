package edu.tucn.ispse.lecture3.ex2polymorphism.wpoly;

/**
 * @author Radu Miron
 * @version 1
 */
public class Car {
    private String displayName;

    public Car(String displayName) {
        this.displayName = displayName;
    }

    public void start() {
        System.out.printf("%s starts\n", displayName);
    }

    public void go() {
        System.out.printf("%s goes fast\n", displayName);
    }

    public void stop() {
        System.out.printf("%s stops\n", displayName);
    }
}
