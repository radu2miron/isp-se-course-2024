package edu.tucn.ispse.lecture5.ex2abstactClass;

/**
 * @author Radu Miron
 * @version 1
 */
public abstract class Vehicle {
    private int wheelsNum;
    private String manufacturer;

    public abstract void move();

    public void printVehicleType(){
        System.out.println("It is a " + this.getClass().getSimpleName());
    }
}
