package co.com.accenture.mobile.swaglabs.tasks.buy.pay;

import co.com.accenture.mobile.swaglabs.interactions.buy.FIllUserFormWithout;
import co.com.accenture.mobile.swaglabs.interactions.buy.GoToCar;
import co.com.accenture.mobile.swaglabs.models.User;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.accenture.mobile.swaglabs.userinterfaces.buy.car.CarPage.BTN_CHECKOUT;
import static co.com.accenture.mobile.swaglabs.utils.Constants.PRODUCT_IN_MEMORY;
import static co.com.accenture.mobile.swaglabs.utils.Constants.USER_IN_MEMORY;

@AllArgsConstructor
public class PayPurchaseWithout implements Task {
    private final String label;
    public static PayPurchaseWithout theLabel(String label){
        return Tasks.instrumented(PayPurchaseWithout.class,label);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = actor.recall(USER_IN_MEMORY);
        String product = actor.recall(PRODUCT_IN_MEMORY);
        actor.attemptsTo(
                GoToCar.toPay(product),
                Click.on(BTN_CHECKOUT),
                FIllUserFormWithout.theLabel(label).toUser(user));
    }
}
