package edu.tucn.ispse.lecture5.ex2abstactClass;

/**
 * @author Radu Miron
 * @version 1
 */
public class Bike extends Vehicle{
    @Override // override abstract method - mandatory
    public void move() {
        System.out.println("It moves by pedaling");
    }
}
