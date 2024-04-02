package co.com.accenture.mobile.swaglabs.tasks.buy.add_to_car;

import co.com.accenture.mobile.swaglabs.questions.SeeTheElement;
import co.com.accenture.mobile.swaglabs.questions.login.ValidateLogin;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.accenture.mobile.swaglabs.userinterfaces.products.ProductPage.BTN_ADD_TO_CAR;
import static co.com.accenture.mobile.swaglabs.userinterfaces.home.HomePage.TXT_PRODUCT_NAME;
import static co.com.accenture.mobile.swaglabs.utils.Constants.PRODUCT_IN_MEMORY;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

@AllArgsConstructor
public class AddToCarForTheProductPage implements Task {
    private final String product;

    public static AddToCarForTheProductPage theProduct(String product) {
        return Tasks.instrumented(AddToCarForTheProductPage.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(ValidateLogin.inScreen()));
        actor.remember(PRODUCT_IN_MEMORY, product);
        actor.attemptsTo(Click.on(TXT_PRODUCT_NAME.of(product)));
        actor.should(seeThat(SeeTheElement.forText(product)));
        actor.attemptsTo(Click.on(BTN_ADD_TO_CAR));
    }
}
