package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.VersionPhpStep;

public class VersionPhpDefinition {


    @Steps
    VersionPhpStep versionPhpStep;


    @Given("^Abrir url\"([^\"]*)\" en navegador$")
    public void abrirUrlEnNavegador(String url) throws Throwable {
        versionPhpStep.abrirUrlEnNavegador(url);
    }

    @When("^ingresar usuario\"([^\"]*)\"$")
    public void ingresarUsuario(String usuario) throws Throwable {
        versionPhpStep.ingresarusuario(usuario);
    }

    @And("^Ingresar contraseña\"([^\"]*)\"$")
    public void ingresarContraseña(String pass) throws Throwable {
        versionPhpStep.ingresarpass(pass);

    }

    @And("^Iniciar sesion$")
    public void iniciarSesion() {
        versionPhpStep.ingresar();
    }

    @Then("^validar actualizacion php$")
    public void validarActualizacionPhp() {
        versionPhpStep.validarActualizacionPhp();
    }

    @Then("^validar actualizacion wordPress$")
    public void validarActualizacionWordPress() {
        versionPhpStep.validarActualizacionWordPress();
    }
}
