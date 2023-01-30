package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Login {
    //This Page Object is for the Facebook login page, it uses the Page Factory design
    WebDriver driver;

    @CacheLookup
    @FindBy(id = "email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "pass")
    WebElement pass;

    @CacheLookup
    @FindBy(tagName = "button")
    WebElement loginBtn;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='_8eso'")
    WebElement welMsg;
    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginWithCredentials(String username, String password) {

        Reporter.log("Username = " + username);
        Reporter.log("Password = " + password);

        email.clear();
        email.sendKeys(username);

        pass.clear();
        pass.sendKeys(password);

    }

    public String getWelcomeMsg() {
        return welMsg.getText();
    }
}
