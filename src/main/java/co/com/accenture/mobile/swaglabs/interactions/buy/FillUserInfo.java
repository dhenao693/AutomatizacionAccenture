package co.com.accenture.mobile.swaglabs.interactions.buy;

import co.com.accenture.mobile.swaglabs.models.User;
import lombok.RequiredArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.accenture.mobile.swaglabs.userinterfaces.buy.user_info.UserInfoPage.BTN_CONTINUE;
import static co.com.accenture.mobile.swaglabs.userinterfaces.buy.user_info.UserInfoPage.LBL_LASTNAME;
import static co.com.accenture.mobile.swaglabs.userinterfaces.buy.user_info.UserInfoPage.LBL_NAME;
import static co.com.accenture.mobile.swaglabs.userinterfaces.buy.user_info.UserInfoPage.LBL_POSTAL_CODE;

@RequiredArgsConstructor
public class FillUserInfo implements Interaction {
    private final User user;
    private boolean fillName = true;
    private boolean fillLastname = true;
    private boolean fillPostalCode = true;

    public static FillUserInfo toPay(User user) {
        return Tasks.instrumented(FillUserInfo.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(fillName).andIfSo(Enter.theValue(user.getName()).into(LBL_NAME)));

        actor.attemptsTo(Check.whether(fillLastname).andIfSo(Enter.theValue(user.getLastname()).into(LBL_LASTNAME)));

        actor.attemptsTo(Check.whether(fillPostalCode).andIfSo(Enter.theValue(user.getPostalCode()).into(LBL_POSTAL_CODE)));

        actor.attemptsTo(Click.on(BTN_CONTINUE));

    }

    public FillUserInfo withoutName() {
        fillName = false;
        return this;
    }

    public FillUserInfo withoutLastname() {
        fillLastname = false;
        return this;
    }

    public FillUserInfo withoutPostalCode() {
        fillPostalCode = false;
        return this;
    }
}
