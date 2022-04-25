package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class CartPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement sauceLabsBikeDeatilsAdd;
    WebElement removeSauceLabsBackpack;
    WebElement checkoutButton;
    List <WebElement> lista;
    ArrayList<String> zeljeniProizvodi =  new ArrayList<String>(){{
    add("Sauce Labs Backpack");
    add("Sauce Labs Bike Light");
    }};
    WebElement removeBackpack;
    public CartPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    public ArrayList<String> getZeljeniProizvodi() {
        return zeljeniProizvodi;
    }

    public WebElement getSauceLabsBikeDeatilsAdd() {
        return driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
    }

    public WebElement getRemoveSauceLabsBackpack() {
        return driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"));
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(By.id("checkout"));
    }

    public List<WebElement> getLista() {
        return driver.findElements(By.className("inventory_item_name"));
    }

    public WebElement getRemoveBackpack() {
        return driver.findElement(By.cssSelector("#remove-sauce-labs-backpack"));
    }
}
