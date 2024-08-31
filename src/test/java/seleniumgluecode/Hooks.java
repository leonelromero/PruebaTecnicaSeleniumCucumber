package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resource/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public static ChromeDriver getDriver() {
        return (ChromeDriver) driver;
    }
}
