package com.shoppingcart.pages;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ShippingPage {
    public static final Target FULL_NAME = Target.the("nombre completo")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/fullNameET"));

    public static final Target ADDRESS = Target.the("direccion")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/address1ET"));

    public static final Target CITY = Target.the("ciudad")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/cityET"));

    public static final Target ZIP_CODE = Target.the("codigo postal")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/zipET"));

    public static final Target COUNTRY = Target.the("pais")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/countryET"));

    public static final Target TO_PAYMENT = Target.the("continuar a pago")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/paymentBtn"));

    public static final Target ADDRESS_ERROR = Target.the("error direccion")
            .locatedBy("//*[contains(@text,'required')]");
}
