package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement username;
    WebElement password;
    WebElement loginButton;
    WebElement errorMessage;

    public LogInPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.cssSelector(".error-message-container.error"));
    }
    public String username1 (){
        String username = "standard_user";
        return username;
    }
    public String username2 (){
        String username = "secret_sauce";
        return username;
    }
    public String username3 (){
        String username = "problem_user";
        return username;
    }
    public String username4 (){
        String username = "performance_glitch_user";
        return username;
    }
    public String praviPassword (){
        String password = "secret_sauce";
        return password;
    }
    public WebElement takePassword(){
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/text()"));
    }

    public String errorMessage (){
        return this.getErrorMessage().getText();

    }
    public void inputUsername1 (){
        getUsername().sendKeys(username1());
    }
    public void inputPassword (){
        getPassword().sendKeys(praviPassword());
    }
}
