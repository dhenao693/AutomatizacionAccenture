package co.com.accenture.mobile.swaglabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class GeneralPage {
    public static final Target BTN_CAR = Target.the("")
            .locatedForAndroid(AppiumBy.accessibilityId("test-Carrito"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));

    public static final Target BTN_CANCEL= Target.the("")
            .locatedForAndroid(AppiumBy.accessibilityId("test-CANCELAR"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));

    public static final Target TXT_GENERIC = Target.the("")
            .locatedBy("//android.widget.TextView[@text='{0}']");
}
