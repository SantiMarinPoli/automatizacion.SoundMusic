/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundmusic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author FAMILIA
 */
public class artistas {

    WebDriver driver;
    By navBarArtista = By.id("artista");
    By btnRegistrar = By.id("btnRegistrar");
    By btnRegresar = By.id("btn-regresar");

    public void clickMainArtista() {
        driver.findElement(navBarArtista);
    }
    
    public void clickRegistrarArtista() {
        driver.findElement(btnRegistrar);
    }
    
    public void clickRegresar() {
        driver.findElement(btnRegistrar);
    }
    
    public void artistaApp(){
        this.clickMainArtista();
        this.clickRegistrarArtista();
        this.clickRegresar();
    }
}
