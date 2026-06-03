package ar.org.icaro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage
{
    //ATRIBUTOS

    private WebDriver driver;
    private WebDriverWait wait;

    //LOCALIZADORES

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.className("error-message-container");


    private static final String URL = "https://www.saucedemo.com";


    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


   public LoginPage goTo(){
        driver.get(URL);
        return this;

   }

   public LoginPage enterUsername(String username){

       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));

       element.sendKeys(username);

       return this;

   }
    public LoginPage enterPassword(String password){

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));

        element.sendKeys(password);

        return this;

    }

    public InventoryPage clickLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        return new InventoryPage(driver);
    }

    public InventoryPage loginAs(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        return clickLogin();
    }

    //Login con error

    public LoginPage loginExpectingError(String username, String password){
        enterUsername(username);
        enterPassword(password);

        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();


        return this;


    }

    //Metodos de verificacion

    public boolean isErrorDisplayed(){

        try {

            return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).isDisplayed();
        }catch (Exception e){
            return false;
        }

    }

    public boolean isUsernameFieldDisplayed() {
        try {
            return driver.findElement(usernameField).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPasswordFieldDisplayed() {
        try {
            return driver.findElement(passwordField).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLoginButtonDisplayed() {
        try {
            return driver.findElement(loginButton).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }






}
