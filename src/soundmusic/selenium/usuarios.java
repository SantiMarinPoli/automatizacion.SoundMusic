package soundmusic.selenium;

import java.util.List;
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
    By usuarios = By.id("usuarios");
    By registrarUsuario = By.id("registrarUsuario");
    By nom1 = By.id("nom1");
    By nom2 = By.id("nom2");
    By apellido1 = By.id("apellido1");
    By apellido2 = By.id("apellido2");
    By sex = By.name("sexo");
    By sex1 = By.id("textSex1");
    By sex2 = By.id("textSex2");
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
    By check = By.xpath("/html/body/div/div[1]/div[2]/form/div[12]/label");
    By btnRegresar = By.id("btn-regresar");
    By btnGuardar = By.id("btnGuardar");

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

//    public void selectSex() {
//        try {
//            String generoSelected = "M";
//            List<WebElement> generoList = (List<WebElement>) driver.findElement(sex);
//            System.out.println("El numero de radio el boton del genero es "+generoList.size());
//            for(int i=0; i< generoList.size();i++){
//                String genero = generoList.get(i).getAttribute("value");
//                System.out.println(genero);
//                if (genero.equalsIgnoreCase(generoSelected)) {
//                    generoList.get(i).click();
//                    Thread.sleep(5000);
//                    break;
//                }
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
    public void selectSex() {
        try {
            
            WebElement btnMale = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[3]/label[1]"));
            WebElement btnFemale = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[3]/label[2]"));
            String genderSelected = "Masculino";

            if (genderSelected.equalsIgnoreCase("masculino")) {
                btnMale.click();
            } else if (genderSelected.equalsIgnoreCase("femenino")) {
                btnFemale.click();
            }
            
            Thread.sleep(5000);

        } catch (Exception e) {
            System.out.println(e);
        }
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
        try {
            WebElement perfil_select = driver.findElement(perfil);
            Select perfil_dd = new Select(perfil_select);
            perfil_dd.selectByIndex(1);
            Thread.sleep(3000);
            perfil_dd.selectByValue("2");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setNumCel(String strNumCel) {
        driver.findElement(numCel).sendKeys(strNumCel);
    }

    public void setNumTel(String strNumTel) {
        driver.findElement(numTel).sendKeys(strNumTel);
    }

    public void selectedPais() {
        try {
            WebElement pais_select = driver.findElement(pais);
            Select pais_dd = new Select(pais_select);
            pais_dd.selectByIndex(1);
            Thread.sleep(3000);
            pais_dd.selectByValue("2");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectedCity() {
        try {
            WebElement city_select = driver.findElement(ciudad);
            Select city_dd = new Select(city_select);
            city_dd.selectByIndex(1);
            Thread.sleep(3000);
            city_dd.selectByValue("2");
            Thread.sleep(3000);
            city_dd.selectByValue("3");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setDireccion(String strDireccion) {
        driver.findElement(direccion).sendKeys(strDireccion);
    }

    public void setBarrio(String strBarrio) {
        driver.findElement(barrio).sendKeys(strBarrio);
    }

    public void checkConfirmacion() {
        try {
            Thread.sleep(3000);
            driver.findElement(check).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickRegresar() {
        driver.findElement(btnRegresar).click();
    }

    public void clickGuardar() {
        try {
            Thread.sleep(5000);
            driver.findElement(btnGuardar).click();
            Thread.sleep(9000);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void usuarioApp(String nom1, String nom2, String apellido1, String apellido2, String email, String nomUsuario, String pass1, String pass2, String numCel, String direccion) {
        this.clickUsuarios();
        this.clickRegistrarUsuario();
        this.setNom1(nom1);
        this.setNom2(nom2);
        this.setApellido1(apellido1);
        this.setApellido2(apellido2);
        this.selectSex();
        this.setEmail(email);
        this.setNomUsuario(nomUsuario);
        this.setPass1(pass1);
        this.setPass2(pass2);
        this.selectedPerfil();
        this.setNumCel(numCel);
        this.selectedPais();
        this.selectedCity();
        this.setDireccion(direccion);
        this.checkConfirmacion();
        this.clickGuardar();
    }

}
