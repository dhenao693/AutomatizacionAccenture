package co.com.accenture.mobile.swaglabs.interactions.buy;

import co.com.accenture.mobile.swaglabs.models.User;
import io.cucumber.java.PendingException;
import lombok.RequiredArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.accenture.mobile.swaglabs.utils.Constants.USER_IN_MEMORY;

@RequiredArgsConstructor
public class FIllUserFormWithout implements Task {
    private final String lblName;
    private User user;

    public static FIllUserFormWithout theLabel(String label) {
        return Tasks.instrumented(FIllUserFormWithout.class, label);
    }

    public  FIllUserFormWithout toUser(User user) {
        this.user = user;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


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
