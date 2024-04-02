package co.com.accenture.mobile.swaglabs.interactions.buy;

import co.com.accenture.mobile.swaglabs.questions.SeeTheElement;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.accenture.mobile.swaglabs.userinterfaces.GeneralPage.BTN_CAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

@AllArgsConstructor
public class GoToCar implements Interaction {
    private final String product;

    public static GoToCar toPay(String product) {
        return Tasks.instrumented(GoToCar.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_CAR));
        actor.should(seeThat(SeeTheElement.forText(product)));
        actor.attemptsTo(Click.on(BTN_CAR));
    }
}
