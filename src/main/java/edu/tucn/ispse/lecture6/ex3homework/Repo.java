package edu.tucn.ispse.lecture6.ex3homework;

/**
 * @author Radu Miron
 * @version 1
 */
public interface Repo {
    void create(Person p);

    Person read(String idNumber);

    void update(Person p); // replace Person with same ID if exists; add a new one otherwise

    Person delete(String idNumber);
}
