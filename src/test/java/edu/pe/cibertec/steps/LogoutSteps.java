package com.shoppingcart.stepdefinitions;

import com.shoppingcart.pages.LoginPage;
import com.shoppingcart.pages.ProfilePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import org.junit.jupiter.api.Assertions;

public class LogoutSteps {

    private Actor actor;

    @Before
    public void setUp() {
        actor = Actor.named("Usuario");
    }

    @After
    public void tearDown() {
    }

    @When("hace clic en el menu de usuario")
    public void haceClicEnElMenuDeUsuario() {
        actor.attemptsTo(Click.on(ProfilePage.MENU_BUTTON));
    }

    @And("hace clic en cerrar sesion")
    public void haceClicEnCerrarSesion() {
        actor.attemptsTo(Click.on(ProfilePage.LOGOUT_BUTTON));
    }

    @Then("deberia regresar a la pantalla de login")
    public void deberiaRegresarALaPantallaDeLogin() {
        Assertions.assertTrue(LoginPage.LOGIN_BUTTON.resolveFor(actor).isVisible());
    }
}
