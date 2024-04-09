package edu.tucn.ispse.lecture8.ex5_mvc;

import edu.tucn.ispse.lecture8.ex5_mvc.controller.PersonController;
import edu.tucn.ispse.lecture8.ex5_mvc.model.PersonModel;
import edu.tucn.ispse.lecture8.ex5_mvc.view.PersonView;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        PersonModel personModel = new PersonModel();
        PersonView personView = new PersonView();
        PersonController personController = new PersonController(personModel, personView);
    }
}
