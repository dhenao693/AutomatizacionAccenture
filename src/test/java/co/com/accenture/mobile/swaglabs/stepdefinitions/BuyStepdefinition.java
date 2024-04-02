package co.com.accenture.mobile.swaglabs.stepdefinitions;

import co.com.accenture.mobile.swaglabs.interactions.buy.FIllUserFormWithout;
import co.com.accenture.mobile.swaglabs.questions.SeeTheElement;
import co.com.accenture.mobile.swaglabs.tasks.buy.add_to_car.AddToCarForTheHome;
import co.com.accenture.mobile.swaglabs.tasks.buy.add_to_car.AddToCarForTheProductPage;
import co.com.accenture.mobile.swaglabs.tasks.buy.pay.PayPurchase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.accenture.mobile.swaglabs.utils.MessagesContanst.STR_THANKS_FOR_YOUR_ORDER;
import static co.com.accenture.mobile.swaglabs.utils.MessagesContanst.STR_YOUR_ORDER_PROCESSED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyStepdefinition {
    @When("select the product {string} to buy from home")
    public void selectTheProductToBuyFromHome(String product) {
        theActorInTheSpotlight().attemptsTo(AddToCarForTheHome.theProduct(product));
    }

    @When("select the product {string} to buy from product page")
    public void selectTheProductToBuyFromProductPage(String product) {
        theActorInTheSpotlight().attemptsTo(AddToCarForTheProductPage.theProduct(product));
    }

    @Then("see the confirmation buy text")
    public void seeTheConfirmationBuyText() {
        theActorInTheSpotlight().should(
                seeThat(SeeTheElement.forText(STR_THANKS_FOR_YOUR_ORDER)));

        theActorInTheSpotlight().should(
                seeThat(SeeTheElement.forText(STR_YOUR_ORDER_PROCESSED)));
    }

    @When("go to pay the product")
    public void goToPayTheProduct() {
        theActorInTheSpotlight().attemptsTo(PayPurchase.toCar());
    }

    @When("go to pay the product without label {string}")
    public void goToPayTheProductWithoutLabel(String label) {
        theActorInTheSpotlight().attemptsTo(FIllUserFormWithout.theLabel(label));
    }
}
