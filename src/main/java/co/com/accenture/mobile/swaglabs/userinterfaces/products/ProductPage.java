package co.com.accenture.mobile.swaglabs.userinterfaces.products;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target BTN_REMOVE_PRODUCT = Target.the("")
            .locatedForAndroid(AppiumBy.accessibilityId("test-REMOVER"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));


    public static final Target BTN_ADD_TO_CAR = Target.the("")
            .locatedForAndroid(AppiumBy.accessibilityId("test-AÑADIR A CARRITO"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));



}
