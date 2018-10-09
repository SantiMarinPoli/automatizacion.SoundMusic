
package soundmusic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Santiago Cortes Marin
 */
public class empresas {
    
    WebDriver driver;
    By empresas = By.id("empresas");
    By btnRegistrar = By.id("btnRegistrar");
    By btnRegresar = By.id("btn-regresar");
    
    public void clickMainEmpresa(){
        driver.findElement(empresas);
    }
    
    public void clickRegistrarEmpresa(){
        driver.findElement(btnRegistrar);
    }
    
    public void clickRegresar(){
        driver.findElement(btnRegresar);
    }
    
    public void empresaApp(){
        this.clickMainEmpresa();
        this.clickRegistrarEmpresa();
        this.clickRegresar();
    }
    
}
