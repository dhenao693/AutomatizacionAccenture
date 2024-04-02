package co.com.accenture.mobile.swaglabs.tasks.buy.pay;

import co.com.accenture.mobile.swaglabs.interactions.buy.FillUserInfo;
import co.com.accenture.mobile.swaglabs.interactions.buy.GoToCar;
import co.com.accenture.mobile.swaglabs.interactions.waits.WaitPage;
import co.com.accenture.mobile.swaglabs.models.User;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.accenture.mobile.swaglabs.userinterfaces.buy.car.CarPage.BTN_CHECKOUT;
import static co.com.accenture.mobile.swaglabs.userinterfaces.buy.resume.ResumePage.BTN_FINISH_BUY;
import static co.com.accenture.mobile.swaglabs.utils.Constants.PRODUCT_IN_MEMORY;
import static co.com.accenture.mobile.swaglabs.utils.Constants.USER_IN_MEMORY;

import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class PayPurchase implements Task {
    public static PayPurchase toCar() {
        return Tasks.instrumented(PayPurchase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = actor.recall(USER_IN_MEMORY);
        String product = actor.recall(PRODUCT_IN_MEMORY);
        actor.attemptsTo(
                GoToCar.toPay(product),
                Click.on(BTN_CHECKOUT),
                FillUserInfo.toPay(user));

        actor.attemptsTo(WaitPage.aSeconds(3));

//        final int PRESS_TIME = 200; // ms
//
//        int edgeBorder = 10; // better avoid edges
//        PointOption pointOptionStart, pointOptionEnd;
//
//        // init screen variables
//        Dimension dims = BrowseTheWeb.as(actor).getDriver().manage().window().getSize();
//
//        // init start point = center of screen
//        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
//        pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
//
//        try {
//            new TouchAction((PerformsTouchActions) BrowseTheWeb.as(actor).getDriver())
//                    .press(pointOptionEnd)
//                    // a bit more reliable when we add small wait
//                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
//                    .moveTo(pointOptionStart)
//                    .release().perform();
//        } catch (Exception e) {
//            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
//            return;
//        }

        actor.attemptsTo(
//                Falta el scroll para pdoer ubicar el objeto, lo hice manual
                Scroll.to(BTN_FINISH_BUY),
                Click.on(BTN_FINISH_BUY)
        );
    }


}
