package ar.org.icaro;

import ar.org.icaro.pages.InventoryPage;
import ar.org.icaro.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginConPageObjectTest {

    private WebDriver driver;

    private LoginPage loginpage;



    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");

        driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        // Creamos LoginPage y navegamos

        loginpage=new LoginPage(driver);
        loginpage.goTo();
    }



    @AfterMethod

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    public void loginExitosoconPOM(){
        InventoryPage inventoryPage = loginpage.loginAs("standard_user","secret_sauce");
        Assert.assertTrue(inventoryPage.isOnInventoryPage(),"DEBERIA ESTAR EN LA PAGINA DE INVENTARIO");
        Assert.assertEquals(inventoryPage.getInventoryTitle(),"Products","El titulo deberia ser productos");
    }


    @Test
    public void verificarElementosLoginConPOM() {
        Assert.assertTrue(loginpage.isUsernameFieldDisplayed(),
                "Campo de usuario debería ser visible");
        Assert.assertTrue(loginpage.isPasswordFieldDisplayed(),
                "Campo de password debería ser visible");
        Assert.assertTrue(loginpage.isLoginButtonDisplayed(),
                "Botón de login debería ser visible");
    }

    @Test
    public void loginConMethodChaining(){
        InventoryPage inventoryPage=loginpage.enterUsername("standard_user").enterPassword("secret_sauce").clickLogin();

        Assert.assertTrue(inventoryPage.isOnInventoryPage(),
                "Deberia estar en la página de inventario");
    }

}
