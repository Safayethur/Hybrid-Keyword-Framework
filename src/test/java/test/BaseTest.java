package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utils.Common;
import utils.Keyword;

public class BaseTest {

    static WebDriver driver;
    Common common;
    Keyword kw;

    @BeforeClass
    public void beforeClass() {
        kw = new Keyword(driver);
    }

    @Parameters({"browser", "url"})
    @BeforeTest
    public void beforeTest(String browser, String url) {
        common = new Common();
        common.invokeBrowser(browser,url);
        driver = common.getDriver();
    }
    @AfterTest
    public void afterTest() {
//        common.quitBrowserWindow();
    }
}
