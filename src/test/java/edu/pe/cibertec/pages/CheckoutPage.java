package com.shoppingcart.pages;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
    public static final Target CHECKOUT_BUTTON = Target.the("boton checkout")
            .located(AppiumBy.accessibilityId("Confirms products for checkout"));

    public static final Target EMPTY_CART_MESSAGE = Target.the("mensaje carrito vacio")
            .locatedBy("//*[contains(@text,'cart is empty')]");

    public static final Target COMPLETE_PURCHASE_BUTTON = Target.the("boton completar compra")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/paymentBtn"));

    public static final Target SUCCESS_MESSAGE = Target.the("mensaje compra exitosa")
            .locatedBy("//*[contains(@text,'Thank you for your order')]");
