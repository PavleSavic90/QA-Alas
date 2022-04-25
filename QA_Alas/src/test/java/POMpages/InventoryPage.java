package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement products;
    WebElement shoppingCart;
    WebElement sauceLabsBackpack;
    WebElement sauceLabsBackpackDetails;
    WebElement backToProducts;
    WebElement sauceLabsBikeLightDetails;
    WebElement shopingCartBadge;
    WebElement addToCartSauceLight;


    public InventoryPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getProducts() {
        return driver.findElement(By.className("title"));
    }

    public WebElement getShoppingCart() {
        return driver.findElement(By.id("shopping_cart_container"));
    }

    public WebElement getSauceLabsBackpack() {
        return driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getSauceLabsBackpackDetails() {
        return driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getBackToProducts() {
        return driver.findElement(By.cssSelector("#back-to-products"));
    }

    public WebElement getSauceLabsBikeLightDetails() {
        return driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
    }

    public WebElement getShopingCartBadge() {
        return driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
    }

    public WebElement getAddToCartSauceLight() {
        return driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
    }

    public void clickOnAddBackpack(){
        getSauceLabsBackpack().click();
        //metoda koja klikce na add to cart
    }
    public String brojUkorpi(){
        String brojUkorpi = getShopingCartBadge().getText();

        return brojUkorpi;
    }


}
