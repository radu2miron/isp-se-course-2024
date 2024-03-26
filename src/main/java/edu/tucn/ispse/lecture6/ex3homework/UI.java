package edu.tucn.ispse.lecture6.ex3homework;

import java.time.LocalDate;
import java.util.Random;

/**
 * @author Radu Miron
 * @version 1
 */
public class UI {
    private Repo repo;

    public void loadInterface() {
        //todo: implement
        // 1. add menu for selecting the type of repo
        // 2. add menu for selecting the CRUD operations

        if (new Random().nextInt(100) % 2 == 1) {
            repo = new ListRepo();
        } else {
            repo = new MapRepo();
        }

        repo.create(new Person("123", "A", "B", LocalDate.of(1990, 1, 1)));
    }
}
