package edu.tucn.ispse.lecture6.ex3homework;

import java.time.LocalDate;

/**
 * @author Radu Miron
 * @version 1
 */
public record Person(String idNumber, String firstName, String lastName, LocalDate dateOfBirth) {
}
