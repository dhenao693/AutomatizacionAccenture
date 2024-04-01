package co.com.accenture.mobile.swaglabs.tasks.loadapp;

import co.com.accenture.mobile.swaglabs.interactions.WaitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class LoadApp implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitPage.aSeconds(3)
        );

    }

    public static LoadApp toStart() {
        return Tasks.instrumented(LoadApp.class);
    }
}
