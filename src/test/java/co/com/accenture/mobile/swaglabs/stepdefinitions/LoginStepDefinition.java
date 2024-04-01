package co.com.accenture.mobile.swaglabs.stepdefinitions;

import co.com.accenture.mobile.swaglabs.tasks.Login;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {
    @When("login in app")
    public void loginInApp(List<Map<String, String>> users) {
        theActorInTheSpotlight().attemptsTo(Login.withTheUser(users));
    }

    @Then("see the correct username")
    public void seeTheCorrectUsername() {
        throw new PendingException();
    }
}
