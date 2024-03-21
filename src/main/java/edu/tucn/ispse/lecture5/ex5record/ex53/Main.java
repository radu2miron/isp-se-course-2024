package edu.tucn.ispse.lecture5.ex5record.ex53;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        Address address = new Address("5 Flower Street", "Cluj-Napoca");
        Person person = new Person("John Doe", 23, address);

        System.out.println(person);
    }
}
