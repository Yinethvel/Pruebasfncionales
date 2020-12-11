package steps;

import PageObject.LoginPageObject;
import net.serenitybdd.core.Serenity;

public class VersionPhpStep {
    LoginPageObject loginPageObject;
    public void abrirUrlEnNavegador(String url)  {
        try {
            loginPageObject.openAt(url);
            Thread.sleep(2000);
            Serenity.takeScreenshot();
        } catch (Exception e) {
            System.out.println("Error abrirUrlEnNavegador");
        }
    }

    public void ingresarusuario(String usuario)  {
        try {
            loginPageObject.ingresarUsuario(usuario);
        } catch (Exception e) {
            System.out.println("Error ingresarusuario");
        }
    }

    public void ingresarpass(String pass)  {
        try {
            loginPageObject.ingresarPass(pass);
        } catch (Exception e) {
            System.out.println("Error ingresarpass");
        }
    }

    public void ingresar()  {
        try {
            loginPageObject.ingresar();
        } catch (Exception e) {
            System.out.println("Error ingresar");
        }
    }
    public void validarActualizacionPhp()  {
        try {
            loginPageObject.validarActualizacionPhp();
        } catch (Exception e) {
            System.out.println("Error validarActualizacionPhp");
        }
    }

    public void validarActualizacionWordPress()  {
        try {
            loginPageObject.validarActualizacionWordPress();
        } catch (Exception e) {
            System.out.println("Error validarActualizacionWordPress");
        }
    }
}
