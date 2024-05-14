
import calculadora.loginscreen.LoginScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jeani
 */
public class LoginScreenTest {

    @Test
    public void testSucessfulLogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.login("john", "password123"));

    }

    @Test
    public void testFaleidLogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertFalse(loginScreen.login("john", "wrongpassword"));

    }

    @Test
    public void testAddUser() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.addUser("testuser", "testpassword");
        assertTrue(loginScreen.login("testuser", "testpassword"));

    }

}
