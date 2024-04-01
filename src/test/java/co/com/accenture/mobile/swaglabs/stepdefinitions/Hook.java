package co.com.accenture.mobile.swaglabs.stepdefinitions;


import co.com.accenture.mobile.swaglabs.tasks.loadapp.LoadApp;
import co.com.accenture.mobile.swaglabs.utils.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.io.IOException;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class Hook {

    @Before
    public void initializer() {
        setTheStage(new OnlineCast());
        theActor(Constants.DEFAULT_USER);
    }

    @Given("{string} is on swaglabs app")
    public void isOnCinemarkApp(String actorName) {
        theActor(actorName).attemptsTo(
                LoadApp.toStart()
        );
    }
}
