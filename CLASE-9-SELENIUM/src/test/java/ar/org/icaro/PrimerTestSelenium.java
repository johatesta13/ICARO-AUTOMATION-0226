package ar.org.icaro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class PrimerTestSelenium {


    private WebDriver driver;


    @BeforeClass
    public void setup(){
        //webdrivermanager descarga la version de chrome o el navegador que utilizamos

        WebDriverManager.chromedriver().setup();

        // Creamos la instancia de chromedriver
        //Esto abre chrome

        driver = new ChromeDriver();

        //Maximiza la ventana
        driver.manage().window().maximize();

    }


    @Test

    public void NavegarASauceDemo(){

        //Metodo get() navega a la url que le indiquemos

        driver.get("https://www.saucedemo.com/");

        String titulo = driver.getTitle();

        Assert.assertEquals(titulo, "Swag Labs", "El titulo de la pagina no es el esperado");

        System.out.println("Navegamos correctamente hacia la pagina de sauce demo");

        System.out.println("El titulo es: " + titulo);

    }

    @AfterClass
    public void tearDown() throws InterruptedException{

        Thread.sleep(3000);
        if (driver != null){
            driver.quit();
            System.out.println("Navegador cerrado correctamente");
        }

    }

}
