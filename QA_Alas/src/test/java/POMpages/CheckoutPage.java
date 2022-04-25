package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement firstName;
    WebElement lastName;
    WebElement postalCode;
    WebElement continueButton;


    public CheckoutPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFirstName() {
        return driver.findElement(By.cssSelector("#first-name"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement getPostalCode() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue"));
    }
    public void ukucajIme(){
        getFirstName().sendKeys("Pavle");
    }
}
