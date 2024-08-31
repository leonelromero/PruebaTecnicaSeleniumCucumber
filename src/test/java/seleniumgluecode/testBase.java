package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.pageCheckout;
import pom.pageLogin;
import pom.pageProduct;

public class testBase {

    protected WebDriver driver = Hooks.getDriver();
    protected pageLogin pageLogin = new pageLogin();
    protected pageProduct pageProduct = new pageProduct();
    protected pageCheckout pageCheckout = new pageCheckout();

}
