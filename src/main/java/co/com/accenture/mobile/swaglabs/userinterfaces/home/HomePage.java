package co.com.accenture.mobile.swaglabs.userinterfaces.home;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target TXT_PRODUCTS = Target.the("")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='PRODUCTOS']"))
            .locatedForIOS(AppiumBy.accessibilityId("empty"));

    public static final Target TXT_PRODUCT_NAME = Target.the("").locatedBy("//android.widget.TextView[@text='{0}']");

    public static final Target BTN_ADD_TO_CAR = Target.the("")
            .locatedBy("//android.widget.TextView[@text='{0}']/parent::android.view.ViewGroup" +
                    "/android.view.ViewGroup[@content-desc='test-AÑADIR A CARRITO']");


    public static final Target BTN_REMOVE_TO_CAR = Target.the("")
            .locatedBy("//android.widget.TextView[@text='{0}']/parent::android.view.ViewGroup" +
                    "/android.view.ViewGroup[@content-desc='test-REMOVER']");

}
