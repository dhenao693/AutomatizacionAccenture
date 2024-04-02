package co.com.accenture.mobile.swaglabs.questions;

import co.com.accenture.mobile.swaglabs.userinterfaces.GeneralPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.accenture.mobile.swaglabs.userinterfaces.GeneralPage.TXT_GENERIC;

@AllArgsConstructor
public class SeeTheElement implements Question<Boolean> {
    private final String text;

    public static SeeTheElement forText(String text) {
        return new SeeTheElement(text);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_GENERIC.of(text).isVisibleFor(actor);
    }
}
