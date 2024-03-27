package edu.tucn.ispse.lecture6.ex3homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Radu Miron
 * @version 1
 */
public class ListRepo implements Repo {
    private List<Person> people = new ArrayList<>();

    public void create(Person person) {
        people.add(person);
    }

    @Override
    public Person read(String idNumber) {
        //todo: implement
        return null;
    }

    @Override
    public void update(Person p) {
        //todo: implement
    }

    @Override
    public Person delete(String idNumber) {
        //todo: implement
        return null;
    }
}
