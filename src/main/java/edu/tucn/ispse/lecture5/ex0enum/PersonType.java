package edu.tucn.ispse.lecture5.ex0enum;

/**
 * @author Radu Miron
 * @version 1
 */
public enum PersonType {
    STUDENT(101),
    PROFESSOR(201),
    AUXILIARY_EMPLOYEE(301);

    private int code;
    PersonType(int code) {
        this.code = code;
    }

    public static PersonType valueOf(int code) {
        switch (code){
            case 101: return STUDENT;
            case 201: return PROFESSOR;
            case 301: return AUXILIARY_EMPLOYEE;
            default: return null;
        }
    }
}
