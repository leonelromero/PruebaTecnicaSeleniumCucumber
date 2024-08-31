package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageCheckout {

    private By CheckLocator= By.id("checkout");
    private By FirstNameLocator = By.id("first-name");
    private By LastNameLocator = By.id("last-name");
    private By codPostalLocator = By.id("postal-code");
    private By ContinueLocator = By.id("continue");
    private By pageCheck = By.className("title");
    private String Check = "Checkout: Overview";
    private By FinishLocator = By.id("finish");
    private By pageComplete = By.className("title");
    private String Complete = "Checkout: Complete!";
    private By pagefinal = By.className("complete-header");
    private String Finish = "Thank you for your order!";
    private String FirstName = "Alejandro";
    private String LastName = "Silva";
    private String Postal = "453";


    public By getCheckLocator() {
        return CheckLocator;
    }

    public By getFirstNameLocator() {
        return FirstNameLocator;
    }

    public By getLastNameLocator() {
        return LastNameLocator;
    }

    public By getCodPostalLocator() {
        return codPostalLocator;
    }

    public By getContinueLocator() {
        return ContinueLocator;
    }

    public By getPageCheck() {
        return pageCheck;
    }

    public By getFinishLocator() {
        return FinishLocator;
    }

    public By getPageComplete() {
        return pageComplete;
    }

    public By getPagefinal() {
        return pagefinal;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPostal() {
        return Postal;
    }

    public String getCheck() {
        return Check;
    }

    public String getComplete() {
        return Complete;
    }

    public String getFinish() {
        return Finish;
    }
}
