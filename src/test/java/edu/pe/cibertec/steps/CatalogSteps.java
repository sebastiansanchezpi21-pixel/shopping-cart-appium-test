package com.shoppingcart.stepdefinitions;

import com.shoppingcart.pages.ScreenPlayCatalogPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.junit.jupiter.api.Assertions;

public class CatalogSteps {

    private Actor actor;

    @Before
    public void setUp() {
        actor = Actor.named("Usuario");
    }

    @After
    public void tearDown() {
    }

    @Given("que el usuario esta en el catalogo")
    public void queElUsuarioEstaEnElCatalogo() {
    }

    @When("busca el producto {string}")
    public void buscaElProducto(String producto) {
        actor.attemptsTo(
                Click.on(ScreenPlayCatalogPage.SEARCH_BUTTON),
                Enter.theValue(producto).into(ScreenPlayCatalogPage.SEARCH_INPUT)
        );
    }

    @Then("deberia ver productos que contengan {string}")
    public void deberiaVerProductosQueContengan(String producto) {
        Assertions.assertTrue(
                ScreenPlayCatalogPage.PRODUCT_NAME.of(producto)
                        .resolveFor(actor)
                        .isVisible()
        );
    }

    @When("filtra productos por la categoria {string}")
    public void filtraProductosPorLaCategoria(String categoria) {
        actor.attemptsTo(
                Click.on(ScreenPlayCatalogPage.FILTER_BUTTON),
                Click.on(ScreenPlayCatalogPage.CATEGORY_OPTION.of(categoria))
        );
    }

    @Then("deberia ver solo productos de la categoria {string}")
    public void deberiaVerSoloProductosDeLaCategoria(String categoria) {
        Assertions.assertTrue(ScreenPlayCatalogPage.PRODUCT_LIST.resolveFor(actor).isVisible());
    }
}
