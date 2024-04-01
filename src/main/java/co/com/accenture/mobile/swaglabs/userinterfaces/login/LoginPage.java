package co.com.accenture.mobile.swaglabs.userinterfaces.login;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.xpath;

public class LoginPage {
    public static final Target LBL_USER = Target.the("Label Username")
            .locatedForAndroid(AppiumBy.accessibilityId("test-Usuario"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));
    public static final Target LBL_PASSSWORD = Target.the("Label Password")
            .locatedForAndroid(AppiumBy.accessibilityId("test-Contraseña"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));
    public static final Target BTN_LOGIN = Target.the("Button Login")
            .locatedForAndroid(AppiumBy.accessibilityId("test-LOGIN"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));
    public static final Target TXT_ERROR = Target.the("Text login error")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Error\"]/android.widget.TextView"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));

}
