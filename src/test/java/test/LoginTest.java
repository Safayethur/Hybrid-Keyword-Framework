package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pom.Login;
import utils.Keyword;


public class LoginTest extends BaseTest {

    @Parameters({"validUsername", "validPassword"})
    @Test
    public void validUsernameValidPasswordTest(String username, String password) {
        kw.login(username,password);
    }

    @Parameters({"invalidUsername", "invalidPassword"})
    @Test
    public void invalidUsernameInvalidPasswordTest(String username, String password) {
        kw.login(username,password);
    }

    @Parameters({"invalidUsername", "validPassword"})
    @Test
    public void invalidUsernameValidPasswordTest(String username, String password) {
        kw.login(username,password);
    }

    @Parameters({"validUsername", "invalidPassword"})
    @Test
    public void validUsernameInvalidPasswordTest(String username, String password) {
      kw.login(username,password);
    }

    @Test
    public void blankUsernameBlankPasswordTest() {
        String username = " ";
        String password = " ";
        kw.login(username,password);
    }
}
