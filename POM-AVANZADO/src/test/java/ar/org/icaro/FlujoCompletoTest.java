package ar.org.icaro;

import ar.org.icaro.pages.CartPage;
import ar.org.icaro.pages.CheckoutPage;
import ar.org.icaro.pages.InventoryPage;
import ar.org.icaro.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlujoCompletoTest

{
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
    public void CompraCompletaE2E(){
        // PASO 1: Login
        System.out.println("PASO 1: Login");
        InventoryPage inventory= loginpage
                .goTo()
                .loginAs("standard_user","secret_sauce");
        Assert.assertTrue(inventory.isOnInventoryPage(), "Debería estar en la página de inventario");
        System.out.println("   ✓ Login exitoso\n");


        // PASO 2: Agregar productos al carrito
        System.out.println("PASO 2: Agregar productos al carrito");
        inventory.addBackPackToCart().addBikeLightToCart();

        Assert.assertEquals(inventory.getCartItemCount(), 2,
                "Deberían haber 2 productos en el carrito");
        System.out.println("   ✓ 2 productos agregados\n");

        // PASO 3: Ir al carrito
        System.out.println("PASO 3: Ir al carrito");
        CartPage cart = inventory.goToCart();

        Assert.assertTrue(cart.isOnCartPage(),
                "Debería estar en la página del carrito");
        Assert.assertEquals(cart.getCartItemCount(), 2,
                "El carrito debería tener 2 items");
        System.out.println("   ✓ Carrito con 2 items\n");

        // PASO 4: Proceder al checkout
        System.out.println("PASO 4: Proceder al checkout");
        CheckoutPage checkout = cart.proceedToCheckout();
        System.out.println("   ✓ En página de checkout\n");

        // PASO 5: Completar información
        System.out.println("PASO 5: Completar información");
        checkout.completeCheckoutInfo("Juan", "Pérez", "5000");
        System.out.println("   ✓ Información completada\n");

        // PASO 6: Finalizar compra
        System.out.println("PASO 6: Finalizar compra");
        checkout.clickFinish();

        Assert.assertTrue(checkout.isOrderComplete(),
                "La orden debería estar completa");
        Assert.assertEquals(checkout.getConfirmationMessage(),
                "Thank you for your order!",
                "El mensaje de confirmación debería ser correcto");
        System.out.println("   ✓ Orden completada exitosamente\n");

        System.out.println("=== FIN TEST: Compra Completa E2E ===");
    }

}
