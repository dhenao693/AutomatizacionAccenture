package co.com.accenture.mobile.swaglabs.questions.login;


import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.accenture.mobile.swaglabs.userinterfaces.home.HomePage.TXT_PRODUCTS;

@NoArgsConstructor
public class ValidateLogin implements Question<Boolean> {
    public static ValidateLogin inScreen(){
        return new ValidateLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_PRODUCTS.isVisibleFor(actor);
    }
}
