package co.com.accenture.mobile.swaglabs.tasks.buy.pay;

import co.com.accenture.mobile.swaglabs.interactions.buy.FillUserInfo;
import co.com.accenture.mobile.swaglabs.interactions.buy.GoToCar;
import co.com.accenture.mobile.swaglabs.interactions.waits.WaitPage;
import co.com.accenture.mobile.swaglabs.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.accenture.mobile.swaglabs.userinterfaces.buy.car.CarPage.BTN_CHECKOUT;
import static co.com.accenture.mobile.swaglabs.userinterfaces.buy.resume.ResumePage.BTN_FINISH_BUY;
import static co.com.accenture.mobile.swaglabs.utils.Constants.PRODUCT_IN_MEMORY;
import static co.com.accenture.mobile.swaglabs.utils.Constants.USER_IN_MEMORY;

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
        actor.attemptsTo(

//                Falta el scroll para pdoer ubicar el objeto, lo hice manual
//                Scroll.to(BTN_FINISH_BUY),
                Click.on(BTN_FINISH_BUY)
        );
    }


}
