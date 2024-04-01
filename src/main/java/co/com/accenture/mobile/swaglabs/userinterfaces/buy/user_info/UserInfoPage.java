package co.com.accenture.mobile.swaglabs.userinterfaces.buy.user_info;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class UserInfoPage {
    public static final Target LBL_NAME = Target.the("")
            .locatedForAndroid(AppiumBy.accessibilityId("test-Nombre"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));

    public static final Target LBL_LASTNAME= Target.the("")
            .locatedForAndroid(AppiumBy.accessibilityId("test-Apellido"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));

    public static final Target LBL_POSTAL_CODE= Target.the("")
            .locatedForAndroid(AppiumBy.accessibilityId("test-Código postal"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));

    public static final Target BTN_CONTINUE= Target.the("")
            .locatedForAndroid(AppiumBy.accessibilityId("test-CONTINUAR"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));



}
