package edu.tucn.ispse.lecture3.ex2polymorphism.wpoly;

/**
 * @author Radu Miron
 * @version 1
 */
public class BMW extends Car {
    public BMW() {
        super(BMW.class.getName());
    }

    @Override
    public void go() {
        System.out.println(super.getDisplayName() + " goes faster");
    }
}
