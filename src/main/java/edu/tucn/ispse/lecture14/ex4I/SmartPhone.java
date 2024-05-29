package edu.tucn.ispse.lecture14.ex4I;

/**
 * @author Radu Miron
 * @version 1
 */
public class SmartPhone implements Device, Chargeable {
    @Override
    public void charge() {
        System.out.println("The smart phone charges");
    }

    @Override
    public void start() {
        System.out.println("The smart phone starts");
    }

    @Override
    public void stop() {
        System.out.println("The smart phone stops");
    }
}
