package co.com.accenture.mobile.swaglabs.userinterfaces.buy.resume;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ResumePage {
    public static final Target BTN_FINISH_BUY= Target.the("")
            .locatedForAndroid(AppiumBy.accessibilityId("test-TERMINAR"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));


}
