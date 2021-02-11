package co.com.choucair.certification.utestuser.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/utestUser.feature",
                            tags = "@stories",
                            glue = {"co.com.choucair.certification.utestuser.stepdefinitions"},
                            snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerTag {
}
