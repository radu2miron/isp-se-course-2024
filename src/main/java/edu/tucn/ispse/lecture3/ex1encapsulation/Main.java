package edu.tucn.ispse.lecture3.ex1encapsulation;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("181-12-1234", "Mario", "Fusco", 49);
        person.age = 50; // todo: accessing data directly is not OK; fix it!
        System.out.println(person);
    }
}
