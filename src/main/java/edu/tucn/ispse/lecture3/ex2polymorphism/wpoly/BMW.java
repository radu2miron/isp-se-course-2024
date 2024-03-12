package edu.tucn.ispse.lecture3.ex2polymorphism.wpoly;

/**
 * @author Radu Miron
 * @version 1
 */
public class BMW extends Car {
    public BMW(String name) {
        super(name);
    }

    @Override
    public void go() {
        System.out.println("BMW goes faster");
    }
}
