package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Test extends testBase {

        @Given("^El usuario se encuentra en la pagina de inicio$")
        public void el_usuario_se_encuentra_en_la_pagina_de_inicio() throws Throwable {
            Assert.assertEquals(pageLogin.getTitleHomePage(), driver.getTitle());

        }

        @When("^Ingresa los datos de acceso y se loguea$")
        public void ingresa_los_datos_de_acceso_y_se_loguea() throws Throwable {
            WebElement usernameLocator = driver.findElement(pageLogin.getUsernameLocator());
            usernameLocator.sendKeys(pageLogin.getUsername());
            WebElement passwordLocator = driver.findElement(pageLogin.getPasswordLocator());
            passwordLocator.sendKeys(pageLogin.getPassword());
            WebElement loginLocator = driver.findElement(pageLogin.getLoginLocator());
            loginLocator.click();

        }

        @When("^agrega dos productos al carrito de compras$")
        public void agrega_dos_productos_al_carrito_de_compras() throws Throwable {
            WebElement pageTitleLocator = driver.findElement(pageProduct.getPageTitleLocator());
            Assert.assertTrue("No se logueo correctamente", pageTitleLocator.isDisplayed());
            Assert.assertEquals(pageProduct.getProduct(),pageTitleLocator.getText());
            WebElement Product1 = driver.findElement(pageProduct.getProduct1());
            Product1.click();
            WebElement Product2 = driver.findElement(pageProduct.getProduct2());
            Product2.click();
            WebElement CarLocator = driver.findElement(pageProduct.getCarLocator());
            CarLocator.click();

        }

        @When("^completa el formulario de compra$")
        public void completa_el_formulario_de_compra() throws Throwable {
            WebElement pageTitle = driver.findElement(pageProduct.getPageTitle());
            Assert.assertTrue("producto no coincide", pageTitle.isDisplayed());
            Assert.assertEquals(pageProduct.getTitleProduct(),pageTitle.getText());
            WebElement CheckLocator = driver.findElement(pageCheckout.getCheckLocator());
            CheckLocator.click();
            WebElement FirstName = driver.findElement(pageCheckout.getFirstNameLocator());
            FirstName.sendKeys(pageCheckout.getFirstName());
            WebElement LastName = driver.findElement(pageCheckout.getLastNameLocator());
            LastName.sendKeys(pageCheckout.getLastName());
            WebElement codPostal = driver.findElement(pageCheckout.getCodPostalLocator());
            codPostal.sendKeys(pageCheckout.getPostal());
            WebElement ContinueLocator = driver.findElement(pageCheckout.getContinueLocator());
            ContinueLocator.click();

        }

        @When("^se finaliza la compra$")
        public void se_finaliza_la_compra() throws Throwable {
            WebElement pageCheck = driver.findElement(pageCheckout.getPageCheck());
            Assert.assertTrue("producto no coincide", pageCheck.isDisplayed());
            Assert.assertEquals(pageCheckout.getCheck(),pageCheck.getText());
            WebElement FinishLocator = driver.findElement(pageCheckout.getFinishLocator());
            FinishLocator.click();
        }

        @Then("^Se confirma la compra de los productos$")
        public void se_confirma_la_compra_de_los_productos() throws Throwable {
            WebElement pageComplete = driver.findElement(pageCheckout.getPageComplete());
            Assert.assertTrue("producto no coincide", pageComplete.isDisplayed());
            Assert.assertEquals(pageCheckout.getComplete(),pageComplete.getText());
            WebElement pagefinal = driver.findElement(pageCheckout.getPagefinal());
            Assert.assertTrue("producto no coincide", pagefinal.isDisplayed());
            Assert.assertEquals(pageCheckout.getFinish(),pagefinal.getText());

        }
}
