package edu.tucn.ispse.lecture5.ex4lambdas.ex42;

/**
 * @author Radu Miron
 * @version 1
 */
@FunctionalInterface
public interface Computation {
    double compute(double a, double b);

    default void someFunction(){
        System.out.println("something");
    }
}
