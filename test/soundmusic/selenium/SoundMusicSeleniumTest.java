package soundmusic.selenium;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Santiago Cortes Marin
 */
public class SoundMusicSeleniumTest {

    private static WebDriver driver = null;
    login log;
    usuarios us;
    empresas emp;
    artistas art;
    regalias reg;
    logAuditoria aud;

    public SoundMusicSeleniumTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        driver.get("http://localhost:24670/soundMusic/login.jsp");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    /**
     * Test of main method, of class SoundMusicSelenium.
     */
    @Test
    public void testMain() {

        String nomUsuario = "admin";
        String password = "admin";
        log = new login(driver);
        log.ingresarAplicacion(nomUsuario, password);
        us = new usuarios(driver);
        String nom1 = "Miguel";
        String nom2 = "Angel";
        String apellido1 = "Marin";
        String apellido2 = "Arias";
        String email = "miguel-angel@gmail.com";
        String nombreUsuario = "miguel123";
        String pass1 = "miguel123";
        String pass2 = "miguel123";

        us.usuarioApp(nom1, nom2, apellido1, apellido2, email, nombreUsuario, pass1, pass2);
//        emp = new empresas();
//        emp.empresaApp();
//        art = new artistas();
//        art.artistaApp();
    }

}
