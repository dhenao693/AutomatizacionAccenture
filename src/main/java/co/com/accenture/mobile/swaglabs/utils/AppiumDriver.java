package co.com.accenture.mobile.swaglabs.utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriver {


    public static AndroidDriver app() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "U4SKXC5TNNJF9LNF");
        caps.setCapability("automationName", "uiautomator2");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13.0");
        caps.setCapability("NoReset", "true");
        caps.setCapability("appPackage", "com.swaglabsmobileapp");
        caps.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
        caps.setCapability("app", "");


        AndroidDriver driver =
                new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
        return driver;
    }
}