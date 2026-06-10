package ar.org.icaro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {


    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.className("error-message-container");


    private static final String URL = "https://www.saucedemo.com";


    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage goTo(){
        driver.get(URL);
        return this;

    }

    public LoginPage enterUsername(String username){

        type(usernameField,username);
        return this;

    }
    public LoginPage enterPassword(String password){

       type(passwordField,password);
       return this;

    }

    public InventoryPage clickLogin(){
        click(loginButton);
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

        click(loginButton);


        return this;


    }

    //Metodos de verificacion

    public boolean isErrorDisplayed(){

       return isElementVisible(errorMessage);

    }

    public boolean isUsernameFieldDisplayed() {
        return isElementVisible(usernameField);
    }

    public boolean isPasswordFieldDisplayed() {
      return isElementVisible(passwordField);
    }

    public boolean isLoginButtonDisplayed() {
       return isElementVisible(loginButton);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }



}
