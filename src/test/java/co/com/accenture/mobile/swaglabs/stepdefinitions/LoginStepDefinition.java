package co.com.accenture.mobile.swaglabs.stepdefinitions;

import co.com.accenture.mobile.swaglabs.tasks.login.LoginUser;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {
    @When("he login in app from profile")
    public void registerInApp(List<Map<String,String>> users) {
        theActorInTheSpotlight().attemptsTo(
                LoginUser.inApp(users)
        );
    }

    @Then("see the correct username")
    public void seeTheCorrectUsername() {
        throw new PendingException();
    }
}
