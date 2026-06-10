package ar.org.icaro.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

    // Título de la página (muestra "Your Cart")
    private By pageTitle = By.className("title");

    // Botón para ir al checkout
    private By checkoutButton = By.id("checkout");

    // Botón para volver a seguir comprando
    private By continueShoppingBtn = By.id("continue-shopping");

    // Cada item en el carrito tiene esta clase
    // Usamos findElements (plural) para obtener todos
    private By cartItems = By.className("cart_item");

    // Botones de "Remove" para eliminar items
    // El selector busca botones cuyo ID empieza con "remove"
    private By removeButtons = By.cssSelector("button[id^='remove']");

    // Nombres de los productos en el carrito
    private By itemNames = By.className("inventory_item_name");

    // Precios de los productos
    private By itemPrices = By.className("inventory_item_price");


    public CartPage(WebDriver driver) {
        // Llamamos al constructor de BasePage
        super(driver);
    }


    // ============================================================
    // MÉTODOS DE VERIFICACIÓN
    // ============================================================

    public boolean isOnCartPage() {
        // La URL del carrito es: saucedemo.com/cart.html
        return waitForUrlContains("cart");
    }

    public String getTitle() {
        return getText(pageTitle);
    }

    public int getCartItemCount(){
        List<WebElement> items=driver.findElements(cartItems);

        return items.size();
    }

    public boolean isCartEmpty() {
        // Si hay 0 items, el carrito está vacío
        return getCartItemCount() == 0;
    }


    // ============================================================
    // NAVEGACIÓN A OTRAS PÁGINAS
    // ============================================================


    public CheckoutPage proceedToCheckout() {
        click(checkoutButton);

        // Navegamos a CheckoutPage
        return new CheckoutPage(driver);
    }

    public InventoryPage continueShopping() {
        click(continueShoppingBtn);

        // Volvemos a InventoryPage
        return new InventoryPage(driver);
    }

    // ============================================================
    // MÉTODOS PARA GESTIONAR ITEMS
    // ============================================================

    public CartPage removeFirstItem() {
        // Buscamos todos los botones de eliminar
        List<WebElement> buttons = driver.findElements(removeButtons);

        // Si hay al menos un botón, hacemos click en el primero
        if (!buttons.isEmpty()) {
            // .get(0) obtiene el primer elemento de la lista
            buttons.get(0).click();
        }

        return this;
    }

    public CartPage removeAllItems(){
        // Buscamos todos los botones de eliminar
        List<WebElement> buttons = driver.findElements(removeButtons);

        for(WebElement button:buttons){
            button.click();
        }

        return this;
    }

    public String getFirstItemName(){
        List<WebElement> names = driver.findElements(itemNames);

        // Si hay al menos uno, retornamos su texto
        if (!names.isEmpty()) {
            return names.get(0).getText();
        }

        return null;
    }
}
