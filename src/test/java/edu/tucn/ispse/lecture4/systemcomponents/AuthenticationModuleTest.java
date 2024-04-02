package edu.tucn.ispse.lecture4.systemcomponents;

import edu.tucn.ispse.lecture4.Main;
import edu.tucn.ispse.lecture4.systemcomponents.AuthenticationModule;
import edu.tucn.ispse.lecture4.model.User;
import org.junit.jupiter.api.*;

/**
 * @author Radu Miron
 * @version 1
 */
public class AuthenticationModuleTest {
    private AuthenticationModule authenticationModule;

    @BeforeEach
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
