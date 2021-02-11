package co.com.choucair.certification.utestuser.tasks;

import co.com.choucair.certification.utestuser.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.rest.interactions.Options;
import org.openqa.selenium.support.ui.Select;

public class CreateUser implements Task {

    private String srtFirstName;
    private String srtLastName;
    private String srtEmail;
    private String srtMonthOfBirth;
    private String srtDayOfBirth;
    private String srtYearOfBirth;
    private String srtPassword;

    public CreateUser(String srtFirstName, String srtLastName, String srtEmail, String srtMonthOfBirth, String srtDayOfBirth, String srtYearOfBirth, String srtPassword) {
        this.srtFirstName = srtFirstName;
        this.srtLastName = srtLastName;
        this.srtEmail = srtEmail;
        this.srtMonthOfBirth = srtMonthOfBirth;
        this.srtDayOfBirth = srtDayOfBirth;
        this.srtYearOfBirth = srtYearOfBirth;
        this.srtPassword = srtPassword;
    }

    public static CreateUser join(String srtFirstName, String srtLastName, String srtEmail, String srtMonthOfBirth, String srtDayOfBirth, String srtYearOfBirth, String srtPassword) {
        return Tasks.instrumented(CreateUser.class, srtFirstName, srtLastName, srtEmail, srtMonthOfBirth, srtDayOfBirth, srtYearOfBirth, srtPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoinPage.BUTTON_JOIN),
                Enter.theValue(srtFirstName).into(UtestJoinPage.INPUT_FIRST_NAME),
                Enter.theValue(srtLastName).into(UtestJoinPage.INPUT_LAST_NAME),
                Enter.theValue(srtEmail).into(UtestJoinPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(srtMonthOfBirth).from(UtestJoinPage.SELECT_MONTH_BIRTH),
                SelectFromOptions.byVisibleText(srtDayOfBirth).from(UtestJoinPage.SELECT_DAY_BIRTH),
                SelectFromOptions.byVisibleText(srtYearOfBirth).from(UtestJoinPage.SELECT_YEAR_BIRTH),
                Click.on(UtestJoinPage.BUTTON_NEXT_LOCATION),
                Click.on(UtestJoinPage.BUTTON_NEXT_DEVICE),
                Click.on(UtestJoinPage.BUTTON_NEXT_LAST_STEP),
                Enter.theValue(srtPassword).into(UtestJoinPage.INPUT_PASSWORD),
                Enter.theValue(srtPassword).into(UtestJoinPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestJoinPage.INPUT_TERMS_OF_USE),
                Click.on(UtestJoinPage.INPUT_PRIVACY_SETTING)
                );
    }
}
