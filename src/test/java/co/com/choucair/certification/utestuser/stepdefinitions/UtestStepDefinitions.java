package co.com.choucair.certification.utestuser.stepdefinitions;

import co.com.choucair.certification.utestuser.model.UtestUserData;
import co.com.choucair.certification.utestuser.tasks.CreateUser;
import co.com.choucair.certification.utestuser.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

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
    public void heTriesToJoinToday(List<UtestUserData> utestUserData) {

        OnStage.theActorCalled("alex").attemptsTo(CreateUser.join(utestUserData.get(0).getSrtFirstName()
        ,utestUserData.get(0).getSrtLastName(),utestUserData.get(0).getSrtEmail(),utestUserData.get(0).getSrtMonthOfBirth()
        ,utestUserData.get(0).getSrtDayOfBirth(),utestUserData.get(0).getSrtYearOfBirth(),utestUserData.get(0).getSrtPassword()));
    }

    @Then("he creates an account")
    public void heCreatesAnAccount() {
/*
        OnStage.theActorCalled("alex").attemptsTo(Answer.toThe());
*/
    }
}
