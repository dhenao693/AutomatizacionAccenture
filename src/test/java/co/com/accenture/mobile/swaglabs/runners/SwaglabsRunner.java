package co.com.accenture.mobile.swaglabs.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/login.feature"
        },
        glue = {"co/com/accenture/mobile/swaglabs/stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
//        ,tags = "@run"
)
public class SwaglabsRunner {
}
