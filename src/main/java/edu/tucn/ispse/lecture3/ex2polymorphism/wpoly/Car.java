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

    void start() {
        System.out.printf("%s starts\n", displayName);
    }

    void go() {
        System.out.printf("%s goes fast\n", displayName);
    }

    void stop() {
        System.out.printf("%s stops\n", displayName);
    }

    public String getDisplayName() {
        return displayName;
    }
}
