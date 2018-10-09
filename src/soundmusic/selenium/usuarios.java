package soundmusic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Santiago Cortes Marin
 */
public class usuarios {

    WebDriver driver;
    By usuarios = By.id("usuarios");
    By registrarUsuario = By.id("registrarUsuario");
    By btnRegresar = By.id("btn-regresar");

    public usuarios(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUsuarios() {
        driver.findElement(usuarios).click();
    }

    public void clickRegistrarUsuario() {
        driver.findElement(registrarUsuario).click();
    }

    public void clickRegresar() {
        driver.findElement(btnRegresar).click();
    }

    public void usuarioApp() {
        this.clickUsuarios();
        this.clickRegistrarUsuario();
        this.clickRegresar();
    }
}
