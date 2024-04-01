package co.com.accenture.mobile.swaglabs.userinterfaces.buy.car;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CarPage {
    public static final Target BTN_CONTINUE_BUYING = Target.the("")
            .locatedForAndroid(AppiumBy.accessibilityId("test-CONTINUAR COMPRANDO"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));


    public static final Target BTN_CHECKOUT = Target.the("")
            .locatedForAndroid(AppiumBy.accessibilityId("test-CHECKOUT"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));

    public static final Target BTN_REMOVE_TO_CAR = Target.the("")
            .locatedBy("//android.widget.TextView[@text='{0}']/parent::android.view.ViewGroup" +
                    "/parent::android.view.ViewGroup//android.view.ViewGroup[@content-desc='test-REMOVER']");

}
