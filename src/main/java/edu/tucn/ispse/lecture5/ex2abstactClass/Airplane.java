package edu.tucn.ispse.lecture5.ex2abstactClass;

/**
 * @author Radu Miron
 * @version 1
 */
public class Airplane extends Vehicle {
    @Override // override abstract method - mandatory
    public void move() {
        System.out.println("It flies");
    }

    @Override // override non-abstract method - not mandatory
    public void printVehicleType() {
        System.out.println("It is an " + this.getClass().getSimpleName());
    }
}
