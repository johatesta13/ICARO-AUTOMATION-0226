package ar.org.icaro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {


    // ============================================================
    // LOCALIZADORES - Paso 1: Formulario de información
    // ============================================================


    // Campo para el nombre
    private By firstNameField = By.id("first-name");

    // Campo para el apellido
    private By lastNameField = By.id("last-name");

    // Campo para el código postal
    private By postalCodeField = By.id("postal-code");

    // Botón para continuar al siguiente paso
    private By continueButton = By.id("continue");

    // Botón para cancelar y volver al carrito
    private By cancelButton = By.id("cancel");

    // Mensaje de error (aparece si dejamos campos vacíos)
    private By errorMessage = By.cssSelector("[data-test='error']");

    // ============================================================
    // LOCALIZADORES - Paso 2: Resumen de la compra
    // ============================================================

    // Botón para finalizar la compra
    private By finishButton = By.id("finish");

    // Subtotal (precio sin impuestos)
    // Muestra algo como "Item total: $29.99"
    private By summarySubtotal = By.className("summary_subtotal_label");

    // Impuestos
    // Muestra algo como "Tax: $2.40"
    private By summaryTax = By.className("summary_tax_label");

    // Total final (subtotal + impuestos)
    // Muestra algo como "Total: $32.39"
    private By summaryTotal = By.className("summary_total_label");


    // ============================================================
    // LOCALIZADORES - Paso 3: Confirmación
    // ============================================================

    // Título de confirmación (muestra "Thank you for your order!")
    private By confirmationTitle = By.className("complete-header");

    // Texto adicional de confirmación
    private By confirmationText = By.className("complete-text");

    // Botón para volver al inicio
    private By backHomeButton = By.id("back-to-products");


    // ============================================================
    // CONSTRUCTOR
    // ============================================================

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }


    // ============================================================
    // MÉTODOS PASO 1: Formulario de información
    // ============================================================

    public CheckoutPage enterFirstName(String firstName) {
        // type() limpia el campo y escribe el texto
        type(firstNameField, firstName);
        return this;
    }

    public CheckoutPage enterLastName(String lastName) {
        type(lastNameField, lastName);
        return this;
    }

    public CheckoutPage enterPostalCode(String postalCode) {
        type(postalCodeField, postalCode);
        return this;
    }

    public CheckoutPage clickContinue() {
        click(continueButton);
        return this;
    }

    public CartPage clickCancel() {
        click(cancelButton);
        return new CartPage(driver);
    }

    public CheckoutPage completeCheckoutInfo(String firstName, String lastName, String postalCode) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterPostalCode(postalCode);
        clickContinue();
        return this;
    }

    // ============================================================
    // MÉTODOS PASO 2: Resumen de la compra
    // ============================================================

    public CheckoutPage clickFinish() {
        click(finishButton);
        return this;
    }

    public String getSubtotal() {
        return getText(summarySubtotal);
    }

    public String getTax() {
        return getText(summaryTax);
    }

    public String getTotal() {
        return getText(summaryTotal);
    }


    // ============================================================
    // MÉTODOS PASO 3: Confirmación
    // ============================================================
    public String getConfirmationMessage() {
        return getText(confirmationTitle);
    }

    public String getConfirmationText() {
        return getText(confirmationText);
    }

    public InventoryPage clickBackHome() {
        click(backHomeButton);
        return new InventoryPage(driver);
    }

    public boolean isOrderComplete() {
        try {
            // Obtenemos el mensaje de confirmación
            String message = getConfirmationMessage();

            // Verificamos si contiene "Thank you"
            return message.contains("Thank you");
        } catch (Exception e) {
            // Si hay error (elemento no existe), la orden no está completa
            return false;
        }
    }

    public boolean isErrorDisplayed() {
        return isElementVisible(errorMessage);
    }

}
