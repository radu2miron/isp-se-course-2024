package edu.tucn.ispse.lecture13.ex4transactions;

import edu.tucn.ispse.lecture13.utils.model.Address;
import edu.tucn.ispse.lecture13.utils.model.Student;

import java.sql.*;
import java.time.LocalDate;

import static edu.tucn.ispse.lecture13.utils.ConnectionUtils.*;

/**
 * @author Radu Miron
 * @version 1
 */
public class Transactions {
    private static final String INSERT_STUDENT = "INSERT INTO students(first_name, last_name, date_of_birth) VALUES (?, ?, ?)";
    private static final String INSERT_ADDRESS = "INSERT INTO addresses(student_id, street, city, country) VALUES (?, ?, ?, ?)";

    public static void main(String[] args) {
        createTablesIfNotExist();

        // execute successful transaction
        executeTransaction(new Student(null, "Monica", "Popescu", Date.valueOf(LocalDate.parse("2006-01-10"))),
                new Address(null, null, "1st Long Street", "Cluj-Napoca", "Romania"));

        // execute unsuccessful transaction
        executeTransaction(new Student(null, "Levi", "Johnson", Date.valueOf(LocalDate.parse("2006-01-10"))),
                new Address(null, null, "3rd Clean Street", "Taumatawhakatangihangakoauauotamateaturipukakapiki-maungahoronukupokaiwhenuakitnatahu", "New-Zealand"));
        // the second transaction fails because the city name is too long (city VARCHAR(30))
    }

    private static void executeTransaction(Student student, Address address) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) { // open a connection
            try (PreparedStatement stmtStud = conn.prepareStatement(INSERT_STUDENT, Statement.RETURN_GENERATED_KEYS);
                 PreparedStatement stmtAddr = conn.prepareStatement(INSERT_ADDRESS)) { // create a statement
                conn.setAutoCommit(false); // open transaction

                // INSERT STUDENT
                stmtStud.setString(1, student.firstName());
                stmtStud.setString(2, student.lastName());
                stmtStud.setDate(3, new Date(student.dateOfBirth().getTime()));
                stmtStud.executeUpdate(); // execute the insert students statement

                // retrieve the auto generated student id
                int studentId = -1;
                ResultSet generatedKeys = stmtStud.getGeneratedKeys();
                if (generatedKeys.next()) {
                    studentId = generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Unable to retrieve primary key for student");
                }

                //INSERT ADDRESS
                stmtAddr.setInt(1, studentId);
                stmtAddr.setString(2, address.street());
                stmtAddr.setString(3, address.city());
                stmtAddr.setString(4, address.country());
                stmtAddr.executeUpdate(); // execute the statement

                conn.commit(); // commit the transaction
            } catch (SQLException ex) {
                conn.rollback(); // rollback the changes
                throw ex;
            } finally {
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTablesIfNotExist() {
        String sqlCreateStudents = """
                    CREATE TABLE IF NOT EXISTS students(
                        id INT NOT NULL AUTO_INCREMENT,
                        first_name VARCHAR(255),
                        last_name VARCHAR(255),
                        date_of_birth DATE,
                        PRIMARY KEY ( id )
                )""";

        String sqlCreateAddresses = """
                    CREATE TABLE IF NOT EXISTS addresses(
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        student_id INT,
                        street VARCHAR(255),
                        city VARCHAR(30),
                        country VARCHAR(30),
                        CONSTRAINT fk_student_id FOREIGN KEY (student_id)
                            REFERENCES students(id)
                            ON DELETE CASCADE
                            ON UPDATE CASCADE
                )""";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) { // open a connection
            try (Statement stmt = conn.createStatement()) { // create a statement
                conn.setAutoCommit(false); // open transaction
                stmt.executeUpdate(sqlCreateStudents); // execute the statement
                stmt.executeUpdate(sqlCreateAddresses); // execute the statement
                System.out.println("Created 'students' and 'addresses' tables");
                conn.commit(); // commit the transaction
            } catch (SQLException ex) {
                conn.rollback(); // rollback the changes
                throw ex;
            } finally {
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
