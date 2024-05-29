package edu.tucn.ispse.lecture14.ex2O;

/**
 * @author Radu Miron
 * @version 1
 */
public class Car {
    private String color;
    private String licensePlate;

    //once you are done with the implementation don't add new attributes or methods; e.g.:
    //private String stripesColor;

    // methods
}

// instead, OCP says that you should extend the Car and add the new attribute (or method)
class StripedCar extends Car {
    private String stripesColor;

    // maybe some extra methods
}
