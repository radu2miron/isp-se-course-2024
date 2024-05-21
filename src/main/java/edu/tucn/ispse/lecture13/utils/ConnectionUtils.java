package edu.tucn.ispse.lecture13.utils;

/**
 * @author Radu Miron
 * @version 1
 */
public final class ConnectionUtils {
    public static final String SERVER_URL = "jdbc:mysql://localhost:3308/"; // todo: replace port! yours might be 3306
    public static final String DB_URL = "jdbc:mysql://localhost:3308/universities?createDatabaseIfNotExist=true"; // todo: replace port! yours might be 3306
    public static final String DB_URL_2 = "jdbc:mysql://localhost:3308/ocr"; // todo: replace port! yours might be 3306
    public static final String USER = "root"; // todo: replace with your username
    public static final String PASS = "root22"; // todo: replace with your password

    private ConnectionUtils() {
    }
}
