package co.com.accenture.mobile.swaglabs.tasks.buy.add_to_car;

import co.com.accenture.mobile.swaglabs.questions.SeeTheElement;
import co.com.accenture.mobile.swaglabs.questions.login.ValidateLogin;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.accenture.mobile.swaglabs.userinterfaces.home.HomePage.BTN_ADD_TO_CAR;
import static co.com.accenture.mobile.swaglabs.utils.MessagesContanst.STR_THANKS_FOR_YOUR_ORDER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

@AllArgsConstructor
public class AddToCarForTheProductPage implements Task {
    private final String product;

    public AddToCarForTheProductPage theProduct(String product){
        return Tasks.instrumented(AddToCarForTheProductPage.class,product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(ValidateLogin.inScreen()));

        actor.attemptsTo(
                Click.on()
        );
        actor.should(seeThat(SeeTheElement.forText(STR_THANKS_FOR_YOUR_ORDER)));
    }
}
