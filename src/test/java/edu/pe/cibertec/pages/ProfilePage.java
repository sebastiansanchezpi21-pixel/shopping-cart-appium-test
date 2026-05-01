package com.shoppingcart.pages;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProfilePage {
    public static final Target MENU_BUTTON = Target.the("menu usuario")
            .located(AppiumBy.accessibilityId("View menu"));

    public static final Target LOGOUT_BUTTON = Target.the("cerrar sesion")
            .locatedBy("//*[@text='Log Out']");

    public static final Target USERNAME_LABEL = Target.the("usuario logueado")
            .locatedBy("//*[@text='My Account']");
}
