package co.com.accenture.mobile.swaglabs.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.accenture.mobile.swaglabs.userinterfaces.login.LoginPage.TXT_ERROR;

public class SeeErrorLabel implements Question<String> {

    public static SeeErrorLabel inScreen() {
        return new SeeErrorLabel();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_ERROR).answeredBy(actor);
    }
}
