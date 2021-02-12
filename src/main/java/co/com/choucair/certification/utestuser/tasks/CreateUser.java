package co.com.choucair.certification.utestuser.tasks;

import co.com.choucair.certification.utestuser.userinterface.UtestJoinPage;
import co.com.choucair.certification.utestuser.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
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
    private String srtCity;
    private String srtZip;
    private String srtCountry;
    private String srtOS;
    private String srtOSVersion;
    private String srtOSLanguage;

    public CreateUser(String srtFirstName, String srtLastName, String srtEmail, String srtMonthOfBirth, String srtDayOfBirth, String srtYearOfBirth, String srtPassword, String srtCity, String srtZip, String srtCountry, String srtOS, String srtOSVersion, String srtOSLanguage) {
        this.srtFirstName = srtFirstName;
        this.srtLastName = srtLastName;
        this.srtEmail = srtEmail;
        this.srtMonthOfBirth = srtMonthOfBirth;
        this.srtDayOfBirth = srtDayOfBirth;
        this.srtYearOfBirth = srtYearOfBirth;
        this.srtPassword = srtPassword;
        this.srtCity = srtCity;
        this.srtZip = srtZip;
        this.srtCountry = srtCountry;
        this.srtOS = srtOS;
        this.srtOSVersion = srtOSVersion;
        this.srtOSLanguage = srtOSLanguage;
    }

    public static CreateUser join(String srtFirstName, String srtLastName, String srtEmail, String srtMonthOfBirth, String srtDayOfBirth, String srtYearOfBirth, String srtPassword, String srtCity, String srtZip, String srtCountry, String srtOS, String srtOSVersion, String srtOSLanguage) {
        return Tasks.instrumented(CreateUser.class,  srtFirstName, srtLastName, srtEmail, srtMonthOfBirth, srtDayOfBirth, srtYearOfBirth, srtPassword, srtCity, srtZip, srtCountry, srtOS, srtOSVersion, srtOSLanguage);
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
                Enter.theValue(srtCity).into(UtestJoinPage.INPUT_CITY),
                Enter.theValue(srtZip).into(UtestJoinPage.INPUT_ZIP),
                Click.on(UtestJoinPage.SELECT_COUNTRY),
                Enter.theValue(srtCountry).into(UtestJoinPage.INPUT_COUNTRY),
                Click.on(UtestJoinPage.BUTTON_NEXT_DEVICE),
                Click.on(UtestJoinPage.SELECT_OS),
                Enter.theValue(srtOS).into(UtestJoinPage.INPUT_OS),
                Click.on(UtestJoinPage.SELECT_OS_VERSION),
                Enter.theValue(srtOSVersion).into(UtestJoinPage.INPUT_OS_VERSION),
                Click.on(UtestJoinPage.SELECT_OS_LANGUAGE),
                Enter.theValue(srtOSLanguage).into(UtestJoinPage.INPUT_OS_LANGUAGE),
                Click.on(UtestJoinPage.BUTTON_NEXT_LAST_STEP),
                Enter.theValue(srtPassword).into(UtestJoinPage.INPUT_PASSWORD),
                Enter.theValue(srtPassword).into(UtestJoinPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestJoinPage.INPUT_TERMS_OF_USE),
                Click.on(UtestJoinPage.INPUT_PRIVACY_SETTING)
                //Old process to verify if the user was created
                /*Click.on(UtestJoinPage.BUTTON_COMPLETE_SETUP),
                Click.on(UtestLoginPage.LOGIN_BUTTON),
                Enter.theValue(srtEmail).into(UtestLoginPage.INPUT_USER),
                Enter.theValue(srtPassword).into(UtestLoginPage.INPUT_PASSWORD),
                Click.on(UtestLoginPage.ENTER_BUTTON)*/

                );
    }
}
