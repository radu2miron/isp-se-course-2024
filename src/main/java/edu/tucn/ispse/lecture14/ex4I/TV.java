package edu.tucn.ispse.lecture14.ex4I;

/**
 * @author Radu Miron
 * @version 1
 */
public class TV implements Device {
    @Override
    public void start() {
        System.out.println("The TV starts");
    }

    @Override
    public void stop() {
        System.out.println("The TV stops");
    }
}
