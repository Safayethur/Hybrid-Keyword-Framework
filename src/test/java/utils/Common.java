package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {

    private WebDriver driver;

    public void invokeBrowser(String browser, String url) {

        String fs = System.getProperty("file.separator");
        String currDir = System.getProperty("user.dir");
        String path = currDir + fs + "drivers" + fs;

        String osName = System.getProperty("os.name");
        String fileExt = "";

        if(osName.contains("Windows")) {
            fileExt = ".exe";
        }

        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", path + "chromedriver" + fileExt);
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", path + "geckodriver" + fileExt);
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", path + "msedgedriver" + fileExt);
            driver = new EdgeDriver();
        } else {
            System.out.println("valid browser not provided, therefore quitting the automation run.");
            System.exit(0);
        }

        //open url
        if(url != "")
            driver.get(url);
        else
            driver.get("about:blank");

        driver.manage().window().maximize();

    }

    public WebDriver getDriver() {
        return driver;
    }

    public void closeBrowserTab() {
        driver.close();
    }

    public void quitBrowserWindow() {
        driver.quit();
    }

}
