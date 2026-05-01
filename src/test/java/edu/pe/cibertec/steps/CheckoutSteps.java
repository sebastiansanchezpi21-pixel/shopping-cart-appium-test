package com.shoppingcart.stepdefinitions;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.junit.jupiter.api.Assertions;

public class CheckoutSteps {

    private Actor actor;

    @Before
    public void setUp() {
        actor = Actor.named("Usuario");
    }

    @After
    public void tearDown() {
    }

    @When("procede al checkout")
    public void procedeAlCheckout() {
        actor.attemptsTo(Click.on(CheckoutPage.CHECKOUT_BUTTON));
    }

    @And("ingresa los datos de envio")
    public void ingresaLosDatosDeEnvio() {
        actor.attemptsTo(
                Enter.theValue("Juan Perez").into(ShippingPage.FULL_NAME),
                Enter.theValue("Av. Principal 123").into(ShippingPage.ADDRESS),
                Enter.theValue("Lima").into(ShippingPage.CITY),
                Enter.theValue("15001").into(ShippingPage.ZIP_CODE),
                Enter.theValue("Peru").into(ShippingPage.COUNTRY)
        );
    }

    @And("confirma la compra")
    public void confirmaLaCompra() {
        actor.attemptsTo(Click.on(ShippingPage.TO_PAYMENT));
    }

    @Then("deberia ver el mensaje de compra exitosa")
    public void deberiaVerElMensajeDeCompraExitosa() {
        Assertions.assertTrue(CheckoutPage.SUCCESS_MESSAGE.resolveFor(actor).isVisible());
    }

    @Then("deberia ver mensaje de carrito vacio")
    public void deberiaVerMensajeDeCarritoVacio() {
        Assertions.assertTrue(CheckoutPage.EMPTY_CART_MESSAGE.resolveFor(actor).isVisible());
    }

    @And("deja vacia la direccion de envio")
    public void dejaVaciaLaDireccionDeEnvio() {
        actor.attemptsTo(
                Enter.theValue("Juan Perez").into(ShippingPage.FULL_NAME),
                Enter.theValue("").into(ShippingPage.ADDRESS)
        );
    }

    @Then("deberia ver un mensaje de error por direccion requerida")
    public void deberiaVerUnMensajeDeErrorPorDireccionRequerida() {
        Assertions.assertTrue(ShippingPage.ADDRESS_ERROR.resolveFor(actor).isVisible());
    }
}
