package edu.tucn.ispse.lecture4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * @author Radu Miron
 * @version 1
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AuthenticationModuleTest {
    private AuthenticationModule authenticationModule;

    @BeforeAll
    public void init() {
        User[] users = Main.createUsers();
        authenticationModule = new AuthenticationModule(users);
    }

    @Test
    public void testCheckCredentials() {
        Assertions.assertNotNull(authenticationModule.checkCredentials("admin", "pwd1"),
                "the admin user instance with matching credentials should be returned");
        Assertions.assertNull(authenticationModule.checkCredentials("admin", "pwdXYZ"),
                "null should be returned on invalid admin credentials");
        Assertions.assertNotNull(authenticationModule.checkCredentials("client1", "pwd2"),
                "the client user instance with matching credentials should be returned");
        Assertions.assertNull(authenticationModule.checkCredentials("client2", "pwdABC"),
                "null should be returned on invalid client credentials");
    }
}
