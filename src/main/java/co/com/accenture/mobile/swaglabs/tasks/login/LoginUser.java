package co.com.accenture.mobile.swaglabs.tasks.login;

import co.com.accenture.mobile.swaglabs.models.User;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.accenture.mobile.swaglabs.userinterfaces.login.LoginPage.BTN_LOGIN;
import static co.com.accenture.mobile.swaglabs.userinterfaces.login.LoginPage.LBL_PASSSWORD;
import static co.com.accenture.mobile.swaglabs.userinterfaces.login.LoginPage.LBL_USER;
import static co.com.accenture.mobile.swaglabs.utils.ConvertMapToModel.convertMapToUser;

@AllArgsConstructor
public class LoginUser implements Task {
    private List<Map<String, String>> users;

    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = convertMapToUser(users.get(0));
        actor.attemptsTo(
                Click.on(LBL_USER),
                Enter.theValue(user.getEmail()).into(LBL_USER),
                Click.on(LBL_PASSSWORD),
                Enter.theValue(user.getPassword()).into(LBL_PASSSWORD),
                Click.on(BTN_LOGIN)
        );
        System.out.println("dasdsad");
    }

    public static LoginUser inApp(List<Map<String, String>> users) {
        return Tasks.instrumented(LoginUser.class, users);
    }
}
