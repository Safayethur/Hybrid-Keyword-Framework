package test;

import org.checkerframework.checker.units.qual.K;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Keyword;

import static org.testng.Assert.assertTrue;

public class BasicValidation extends BaseTest {

    @Test
    public void titleValidation() {
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = kw.getCurrentPageTitle();
        String failureMessage = "Page title validation failed";

        kw.compareResults(actualTitle,expectedTitle,failureMessage);
    }

    @Test
    public void urlValidation() {
        String expectedUrl = "https://facebook.com/";
        String actualUrl = kw.getCurrentPageUrl();
        String failureMessage = "Url validation failed";


    }
}
