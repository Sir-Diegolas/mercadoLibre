package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WebBasePage {
    protected WebDriver driver;

    public WebBasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public boolean esVisible(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            System.out.println("No se visualiza el elemento...");
            throw new RuntimeException("Elemento no visible: " + element);
        }
    }

    public void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);  // Convertimos segundos a milisegundos
            System.out.println("Esperando " + segundos + " segundos...");
        } catch (InterruptedException e) {
            System.out.println("Error durante la espera: " + e.getMessage());
            Thread.currentThread().interrupt();  // Restablece el estado de interrupción
        }
    }

    public void clickJS(WebElement element) {
        try {
            if (element != null) {
                JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
                jsExecutor.executeScript("arguments[0].click();", element);
                System.out.println("Se hizo clic en el elemento usando JavaScript.");
            } else {
                System.out.println("El elemento es nulo, no se puede hacer clic.");
            }
        } catch (Exception e) {
            System.out.println("Error al hacer clic con JavaScript: " + e.getMessage());
        }
    }

    public void scrollToElement(WebElement element) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
            System.out.println("Scrolled to the element successfully.");
        } catch (Exception e) {
            System.out.println("Failed to scroll to the element: " + e.getMessage());
        }
    }
}
