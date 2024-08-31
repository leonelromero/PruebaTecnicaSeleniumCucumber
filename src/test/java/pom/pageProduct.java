package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageProduct {

    private By pageTitleLocator = By.className("title");
    private By Product1 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By Product2 = By.id("add-to-cart-sauce-labs-bike-light");
    private By CarLocator= By.className("shopping_cart_link");
    private By pageTitle = By.id("item_1_title_link");
    private String Product = "Products";
    private String titleProduct = "Sauce Labs Bolt T-Shirt";

    public By getPageTitleLocator() {
        return pageTitleLocator;
    }

    public By getProduct1() {
        return Product1;
    }

    public By getProduct2() {
        return Product2;
    }

    public By getCarLocator() {
        return CarLocator;
    }

    public By getPageTitle() {
        return pageTitle;
    }

    public String getProduct() {
        return Product;
    }

    public String getTitleProduct() {
        return titleProduct;
    }

}
