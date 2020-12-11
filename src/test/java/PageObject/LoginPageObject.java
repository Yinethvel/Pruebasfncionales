package PageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;


import static org.junit.Assert.fail;

public class LoginPageObject extends PageObject {

    @FindBy(xpath = "//INPUT[@id='user_login']")
    WebElementFacade inputUsuario;
    @FindBy(xpath = "//INPUT[@id='user_pass']")
    WebElementFacade inputPass;
    @FindBy(xpath = "//INPUT[@id='wp-submit']")
    WebElementFacade botonIngresar;
    @FindBy(xpath = "//div[@id='dashboard_php_nag']//h2//span[contains(text(),'PHP Update Required')]")
    WebElementFacade actualizacionPhP;
    @FindBy(xpath = "//div[@id='dashboard_php_nag']/h2")
    WebElementFacade botonPhp;
    @FindBy(xpath = "//div[@id='dashboard_php_nag']/div/p[3]/a")
    WebElementFacade leerMore;
    @FindBy(xpath = "//div[@id='welcome-panel']/div/div/div[2]/ul/li[4]/a")
    WebElementFacade linkVista;
    @FindBy(xpath = "//li[@id='menu-dashboard']/ul/li[3]/a")
    WebElementFacade botonUpdate;
    @FindBy(xpath = "//div[@id='wpbody-content']/div[4]/h2[1]")
    WebElementFacade actualizacionWordpress;
    @FindBy(xpath = "//input[@id='upgrade']")
    WebElementFacade botonUpdateWordPress;
    @FindBy(xpath = "//div[@id='wpbody-content']/div[4]/h1")
    WebElementFacade mensajeUpdateWordPress;

    public void ingresarUsuario(String usuario) {
        try {
            getDriver().manage().window().maximize();
            //getDriver().manage().deleteAllCookies();
            waitFor(2).seconds();
            waitFor(inputUsuario).sendKeys(usuario);
            Serenity.takeScreenshot();
        } catch (Exception e) {
            fail("falla el metodo: ingresarUsuario");
        }
    }

    public void ingresarPass(String pass) {
        try {
            waitFor(inputPass).sendKeys(pass);
            Serenity.takeScreenshot();
        } catch (Exception e) {
            fail("falla el metodo: ingresarPass");
        }
    }

    public void ingresar() {
        try {
            waitFor(botonIngresar).click();
            waitFor(3).second();
            Serenity.takeScreenshot();
        } catch (Exception e) {
            fail("falla el metodo: ingresar.");
        }
    }

    public void validarActualizacionPhp() {
        try {
            posicionarElemento(linkVista);
            if (!leerMore.isVisible()) {
                waitFor(botonPhp).click();
            }
            bordearElemento(actualizacionPhP);
            bordearElemento(leerMore);
            waitFor(2).second();
            Serenity.takeScreenshot();
        } catch (Exception e) {
            fail("falla el metodo: validarActualizacionPhp: ");
        }
    }

    public void validarActualizacionWordPress() {
        try {
            waitFor(botonUpdate).click();
            bordearElemento(actualizacionWordpress);
            waitFor(2).second();
            Serenity.takeScreenshot();
            waitFor(botonUpdateWordPress).click();
            bordearElemento(mensajeUpdateWordPress);
            waitFor(2).second();
            Serenity.takeScreenshot();
        } catch (Exception e) {
            fail("falla el metodo: validarActualizacionPhp: ");
        }
    }

    public void posicionarElemento(WebElementFacade strWebElement) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", strWebElement);
    }

    public void bordearElemento(WebElementFacade webLocalizador) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='2px dashed red'", webLocalizador);
    }
}
