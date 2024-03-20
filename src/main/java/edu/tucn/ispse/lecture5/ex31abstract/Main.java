package edu.tucn.ispse.lecture5.ex31abstract;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle() {
            // abstract classes can't be instantiated???
            public void move() {
                System.out.println("It moves anonymously");
            }

            @Override
            public void changeSpeed() {
                System.out.println("Change speed!");
            }
        };
    }
}
