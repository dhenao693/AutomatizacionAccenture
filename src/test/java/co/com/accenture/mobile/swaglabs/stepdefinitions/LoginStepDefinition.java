package co.com.accenture.mobile.swaglabs.stepdefinitions;

import co.com.accenture.mobile.swaglabs.questions.login.SeeErrorLabel;
import co.com.accenture.mobile.swaglabs.questions.login.ValidateLogin;
import co.com.accenture.mobile.swaglabs.tasks.login.LoginUser;
import co.com.accenture.mobile.swaglabs.tasks.login.LoginWithout;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinition {
    @When("he login in app from profile")
    public void registerInApp(List<Map<String, String>> users) {
        theActorInTheSpotlight().attemptsTo(LoginUser.inApp(users));
    }

    @When("login in app without {string}")
    public void loginInAppWithout(String field, List<Map<String, String>> users) {
        theActorInTheSpotlight().attemptsTo(LoginWithout.theField(users, field));
    }

    @When("login in app without all")
    public void loginInAppWithoutAll(List<Map<String, String>> users) {
        theActorInTheSpotlight().attemptsTo(LoginUser.inApp(users).withoutUser().withoutPassword());
    }

    @Then("see the home page to buy")
    public void seeTheHomePageToBuy() {
        theActorInTheSpotlight().should(seeThat(ValidateLogin.inScreen()));
    }

    @Then("see the message {string}")
    public void seeTheMessage(String message) {
        theActorInTheSpotlight().should(seeThat(SeeErrorLabel.inScreen(), equalTo(message)));
    }
}
