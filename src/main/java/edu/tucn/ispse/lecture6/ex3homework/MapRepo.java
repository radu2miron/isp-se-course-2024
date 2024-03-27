package edu.tucn.ispse.lecture6.ex3homework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Radu Miron
 * @version 1
 */
public class MapRepo implements Repo {
    private Map<String, Person> personByIdNumber = new HashMap<>();

    public void create(Person person) {
        personByIdNumber.put(person.idNumber(), person);
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
