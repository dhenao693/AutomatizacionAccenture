package co.com.accenture.mobile.swaglabs.tasks.loadapp;

import co.com.accenture.mobile.swaglabs.interactions.waits.WaitPage;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class LoadApp implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitPage.aSeconds(2)
        );
    }

    public static LoadApp toStart() {
        return Tasks.instrumented(LoadApp.class);
    }
}
