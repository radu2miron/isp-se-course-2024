package edu.tucn.ispse.lecture5.ex0enum;

/**
 * @author Radu Miron
 * @version 1
 */
public class Person {
    private String name;
    private int age;
    private PersonType type;

    public Person(String name, int age, PersonType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }
}
