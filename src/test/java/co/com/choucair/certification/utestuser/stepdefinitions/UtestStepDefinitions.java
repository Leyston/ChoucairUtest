package co.com.choucair.certification.utestuser.stepdefinitions;

import co.com.choucair.certification.utestuser.tasks.CreateUser;
import co.com.choucair.certification.utestuser.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("Than alex wants to be a new user in Utest")
    public void thanAlexWantsToBeANewUserInUtest() {

        OnStage.theActorCalled("alex").wasAbleTo(OpenUp.thePage());
    }

    @When("He tries to join today")
    public void heTriesToJoinToday() {

        OnStage.theActorCalled("alex").attemptsTo(CreateUser.join());
    }

    @Then("he creates an account")
    public void heCreatesAnAccount() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
