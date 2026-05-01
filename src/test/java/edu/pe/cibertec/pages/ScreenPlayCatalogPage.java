package com.shoppingcart.pages;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ScreenPlayCatalogPage {
    public static final Target PRODUCT_LIST = Target.the("lista de productos")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/productRV"));

    public static final Target SEARCH_BUTTON = Target.the("boton buscar")
            .located(AppiumBy.accessibilityId("Search"));

    public static final Target SEARCH_INPUT = Target.the("campo de busqueda")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/search_src_text"));

    public static final Target FILTER_BUTTON = Target.the("boton filtro")
            .located(AppiumBy.accessibilityId("Filter"));

    public static final Target CATEGORY_OPTION = Target.the("categoria")
            .locatedBy("//*[@text='{0}']");

    public static final Target PRODUCT_NAME = Target.the("producto")
            .locatedBy("//*[contains(@text,'{0}')]" );
