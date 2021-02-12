package co.com.choucair.certification.utestuser.tasks;

import co.com.choucair.certification.utestuser.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
;

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
                Enter.theValue("Los Patios").into(UtestJoinPage.INPUT_CITY),
                Enter.theValue("541010").into(UtestJoinPage.INPUT_ZIP),
                Click.on(UtestJoinPage.SELECT_COUNTRY),
                Enter.theValue("Colombia").into(UtestJoinPage.INPUT_COUNTRY),
                Click.on(UtestJoinPage.BUTTON_NEXT_DEVICE),
                Click.on(UtestJoinPage.SELECT_OS),
                Enter.theValue("Windows").into(UtestJoinPage.INPUT_OS),
                Click.on(UtestJoinPage.SELECT_OS_VERSION),
                Enter.theValue("10 64-bit").into(UtestJoinPage.INPUT_OS_VERSION),
                Click.on(UtestJoinPage.SELECT_OS_LANGUAGE),
                Enter.theValue("English").into(UtestJoinPage.INPUT_OS_LANGUAGE),
                Click.on(UtestJoinPage.BUTTON_NEXT_LAST_STEP),
                Enter.theValue(srtPassword).into(UtestJoinPage.INPUT_PASSWORD),
                Enter.theValue(srtPassword).into(UtestJoinPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestJoinPage.INPUT_TERMS_OF_USE),
                Click.on(UtestJoinPage.INPUT_PRIVACY_SETTING)
                );
    }
}
