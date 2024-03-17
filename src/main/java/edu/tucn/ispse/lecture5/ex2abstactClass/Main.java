package edu.tucn.ispse.lecture5.ex2abstactClass;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Bike(),
                new Bus(),
                new Airplane()
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.printVehicleType();
            vehicle.move();
            System.out.println();
        }
    }
}
