package edu.tucn.ispse.lecture4.systemcomponents;

import edu.tucn.ispse.lecture4.model.User;

/**
 * @author Radu Miron
 * @version 1
 */
public class AuthenticationModule {
    private User[] users;

    public AuthenticationModule(User[] users) {
        this.users = users;
    }

    public User checkCredentials(String username, String password) {
        for (User user : users) {
            if (username.equals(user.getUserName()) && password.equals(user.getPassword())) {
                return user;
            }
        }

        return null;
    }
}
