package POMtests;

import POMbase.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testsQAAlas extends BasePage {
    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }
    @Test
    public void qweqweq(){
        loginPage.inputUsername1();
        loginPage.inputPassword();
        loginPage.getLoginButton().click();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        //Provera testa da smo na pravoj stranici
        inventoryPage.clickOnAddBackpack();
        String expectedNumberInBasket = "1";
        Assert.assertEquals(expectedNumberInBasket,inventoryPage.brojUkorpi());
        //Potvrda u testu da se nalazi jedan predmet u korpi
        inventoryPage.getSauceLabsBikeLightDetails().click();
        inventoryPage.getAddToCartSauceLight().click();
        inventoryPage.getShopingCartBadge().click();
        for (int i = 0; i < cartPage.getLista().size(); i++) {
            String imeProizvoda = cartPage.getLista().get(i).getText();
            String zeljeniProizvodi = cartPage.getZeljeniProizvodi().get(i);
            Assert.assertEquals(imeProizvoda,zeljeniProizvodi);
        }
        //petlja koja radi sa dve liste i uporedjuje ih
        cartPage.getRemoveSauceLabsBackpack().click();
        Assert.assertEquals(cartPage.getLista().get(0), cartPage.getLista().get(0));
        //potvrda da se nalazi samo jedan zeljeni predmet na listi
        cartPage.getCheckoutButton().click();
        checkoutPage.getFirstName().sendKeys("Pavle");
        checkoutPage.getLastName().sendKeys("Savic");
        checkoutPage.getPostalCode().sendKeys("11000");
        checkoutPage.getContinueButton().click();
        String zeljeniURL = "https://www.saucedemo.com/checkout-step-two.html";
        Assert.assertEquals(driver.getCurrentUrl(), zeljeniURL);
        //potvrda da smo na pravoj stranici
        checkoutStepTwoPage.clickOnFinish();
        String expectedMessage = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
        Assert.assertEquals(checkoutStepTwoPage.textMessage(),expectedMessage);
        //potvrda da je ispravna poruka na stranici kada zavrsimo narucivanje predmeta
    }
}
