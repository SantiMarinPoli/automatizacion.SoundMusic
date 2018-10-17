package soundmusic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Santiago Cortes Marin
 */
public class usuarios {

    WebDriver driver;
    WebElement radio1,radio2;
    By usuarios = By.id("usuarios");
    By registrarUsuario = By.id("registrarUsuario");
    By nom1 = By.id("nom1");
    By nom2 = By.id("nom2");
    By apellido1 = By.id("apellido1");
    By apellido2 = By.id("apellido2");
    By sex1 = By.id("sex1");
    By sex2 = By.id("sex2");
    By email = By.id("email");
    By nomUsuario = By.id("nomUsuario");
    By pass1 = By.id("pass1");
    By pass2 = By.id("pass2");
    By perfil = By.id("perfil");
    By numCel = By.id("numCel");
    By numTel = By.id("numTel");
    By pais = By.id("pais");
    By ciudad = By.id("ciudad");
    By direccion = By.id("direccion");
    By barrio = By.id("barrio");
    By check = By.id("check");
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

    public void setNom1(String strNom1) {
        driver.findElement(nom1).sendKeys(strNom1);
    }

    public void setNom2(String strNom2) {
        driver.findElement(nom2).sendKeys(strNom2);
    }

    public void setApellido1(String strApellido1) {
        driver.findElement(apellido1).sendKeys(strApellido1);
    }

    public void setApellido2(String strApellido2) {
        driver.findElement(apellido2).sendKeys(strApellido2);
    }

    public void selectSex1() {
          radio1 = driver.findElement(sex1);
          radio1.click();
          radio1.click();
    }

    public void selectedSex2() {
        radio2 = driver.findElement(sex2);
        radio2.click();
    }

    public void setEmail(String strEmail) {
        driver.findElement(email).sendKeys(strEmail);
    }

    public void setNomUsuario(String strNomUsuario) {
        driver.findElement(nomUsuario).sendKeys(strNomUsuario);
    }

    public void setPass1(String strPass1) {
        driver.findElement(pass1).sendKeys(strPass1);
    }

    public void setPass2(String strPass2) {
        driver.findElement(pass2).sendKeys(strPass2);
    }

    public void selectedPerfil() {
        driver.findElement(perfil).click();
    }

    public void clickRegresar() {
        driver.findElement(btnRegresar).click();
    }

    public void usuarioApp(String nom1, String nom2, String apellido1, String apellido2, String email, String nomUsuario, String pass1, String pass2) {
        this.clickUsuarios();
        this.clickRegistrarUsuario();
        this.setNom1(nom1);
        this.setNom2(nom2);
        this.setApellido1(apellido1);
        this.setApellido2(apellido2);
        this.selectSex1();
        this.setEmail(email);
        this.setNomUsuario(nomUsuario);
        this.setPass1(pass1);
        this.setPass2(pass2);
        this.selectedPerfil();
    }
}
