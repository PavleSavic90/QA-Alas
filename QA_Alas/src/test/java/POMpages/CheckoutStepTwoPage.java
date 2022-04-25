package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutStepTwoPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement finishButton;
    WebElement basket;
    WebElement displayedMessage;


    public CheckoutStepTwoPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public WebElement getFinishButton() {
        return driver.findElement(By.id("finish"));
    }

    public WebElement getBasket() {
        return driver.findElement(By.className("inventory_item_name"));
    }

    public WebElement getDisplayedMessage() {
        return driver.findElement(By.cssSelector("#checkout_complete_container > div"));
    }

    public void clickOnFinish(){
        getFinishButton().click();
    }
    public String textMessage(){
        String text = getDisplayedMessage().getText();
        return text;
    }
}
