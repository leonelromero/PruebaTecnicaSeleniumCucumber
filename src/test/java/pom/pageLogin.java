package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageLogin {

    private String titleHomePage = "Swag Labs";
    private By usernameLocator = By.id("user-name");
    private By passwordLocator = By.id("password");
    private By loginLocator = By.id("login-button");
    private String username = "standard_user";
    private String password = "secret_sauce";


    public String getTitleHomePage() {
        return titleHomePage;
    }

    public By getLoginLocator() {
        return loginLocator;
    }

    public By getUsernameLocator() {
        return usernameLocator;
    }

    public By getPasswordLocator() {
        return passwordLocator;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
