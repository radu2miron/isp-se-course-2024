package edu.tucn.ispse.lecture5.ex0enum;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        // code (int) to PersonType
        PersonType personType = PersonType.valueOf(101);
        System.out.println(personType);

        // name (String) to PersonType
        PersonType personType1 = PersonType.valueOf("PROFESSOR");
        System.out.println(personType1);

        // compare person types - the order (ordinal) in the enum is compared
        System.out.println("\nAUXILIARY_EMPLOYEE comparedTo PROFESSOR: " +
                PersonType.AUXILIARY_EMPLOYEE.compareTo(PersonType.PROFESSOR));
        System.out.println("STUDENT comparedTo PROFESSOR: " +
                PersonType.STUDENT.compareTo(PersonType.PROFESSOR));

        // print all values
        System.out.println("\nAll person types:");
        for (PersonType type : PersonType.values()) {
            System.out.println(type);
        }
    }
}
