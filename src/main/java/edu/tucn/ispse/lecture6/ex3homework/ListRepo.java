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

    //todo: implement the rest of the CRUD operations
}
