package co.com.accenture.mobile.swaglabs.interactions.buy;

import co.com.accenture.mobile.swaglabs.models.User;
import co.com.accenture.mobile.swaglabs.utils.Constants;
import io.cucumber.java.PendingException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.accenture.mobile.swaglabs.utils.Constants.USER_IN_MEMORY;

@RequiredArgsConstructor
public class FIllUserFormWithout implements Task {
    private final String lblName;

    public static FIllUserFormWithout theLabel(String label){
        return Tasks.instrumented(FIllUserFormWithout.class,label);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = actor.recall(USER_IN_MEMORY);

        switch (lblName) {
            case "name":
                actor.attemptsTo(FillUserInfo.toPay(user).withoutName());
                break;
            case "lastname":
                actor.attemptsTo(FillUserInfo.toPay(user).withoutLastname());
                break;
            case "postalCode":
                actor.attemptsTo(FillUserInfo.toPay(user).withoutPostalCode());
                break;
            default:
                throw new PendingException();
        }
    }
}
