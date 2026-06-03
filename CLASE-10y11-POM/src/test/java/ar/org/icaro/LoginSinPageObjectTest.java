//DIAPOSITIVA 27
package ar.org.icaro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginSinPageObjectTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


    /**
     * PROBLEMA 1: Localizadores repetidos en cada test
     * Si cambia el ID "user-name", hay que modificar TODOS los tests
     */
    @Test
    public void loginExitosoSinPOM(){
        // Localizadores directamente en el test - PROBLEMA!
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    /**
     * PROBLEMA 2: Código duplicado
     * Los mismos 3 localizadores aparecen otra vez
     */
    @Test
    public void loginCredencialesInvalidasSinPOM(){
        //Los MISMOS localizadores repetidos -DUPLICACION!
        driver.findElement(By.id("user-name")).sendKeys("usuario_falso");
        driver.findElement(By.id("password")).sendKeys("password_malo");
        driver.findElement(By.id("login-button")).click();

        Assert.assertTrue(driver.findElement(By.className("error-message-container")).isDisplayed());
    }
}
