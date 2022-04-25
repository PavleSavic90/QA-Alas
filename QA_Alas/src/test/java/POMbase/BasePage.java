package POMbase;

import POMpages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public LogInPage loginPage;
    public InventoryPage inventoryPage;
    public CheckoutStepTwoPage checkoutStepTwoPage;
    public CheckoutPage checkoutPage;
    public CartPage cartPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        loginPage = new LogInPage(driver, wdwait);
        inventoryPage = new InventoryPage(driver, wdwait);
        checkoutPage = new CheckoutPage(driver,wdwait);
        checkoutStepTwoPage = new CheckoutStepTwoPage(driver,wdwait);
        cartPage = new CartPage(driver,wdwait);



    }
    @AfterClass
    public void tearDown (){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
