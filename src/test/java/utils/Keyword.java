package utils;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pom.Login;

import static org.testng.Assert.assertTrue;

public class Keyword {

    private WebDriver driver;

    public Keyword(WebDriver driver) {
        this.driver = driver;
    }

    public String getCurrentPageTitle() {
        return driver.getTitle();
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }

    public void compareResults(String expRes, String actRes, String failMsg) {
        Reporter.log("Expected Title = " + expRes);
        Reporter.log("Actual Title = " + actRes);

        assertTrue(actRes.equals(expRes), "Page title validation failed");

    }

    public void login(String username, String password) {
        Login obj = new Login(driver);
        obj.loginWithCredentials(username,password);
    }
}
