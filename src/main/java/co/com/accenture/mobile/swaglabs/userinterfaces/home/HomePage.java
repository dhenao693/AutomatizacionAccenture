package co.com.accenture.mobile.swaglabs.userinterfaces.home;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target TXT_PRODUCTS = Target.the("")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text=\"PRODUCTOS\"]"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));
}
