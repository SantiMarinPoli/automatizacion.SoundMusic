package soundmusic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Santiago Cortes Marin
 */
public class login {
    
    WebDriver driver;
    By nomUsuario = By.id("textUsuario");
    By password = By.id("textPassword");
    By btnIngresar = By.id("btnIngresar");
    
    public login(WebDriver driver) {
        this.driver = driver;
    }

    //Asignar el nombre de usuario en el input
    public void setNomUsuario(String strNomUsuario) {
        driver.findElement(nomUsuario).sendKeys(strNomUsuario);        
    }

    //Asignar la contraseña en el input
    public void setPassword(String strPassword) {
        driver.findElement(password).sendKeys(strPassword);
    }
    
    //Click en el boton de ingresar la pagina
    public void clickLogin(){
        driver.findElement(btnIngresar).click();
    }
    
    public void ingresarAplicacion(String nomUsuario,String password){
       
        this.setNomUsuario(nomUsuario);
        
        this.setPassword(password);
       
        this.clickLogin();
        
    }
    
}
