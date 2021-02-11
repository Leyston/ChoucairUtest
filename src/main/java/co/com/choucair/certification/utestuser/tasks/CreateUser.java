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
    public static CreateUser join() {
        return Tasks.instrumented(CreateUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoinPage.BUTTON_JOIN),
                Enter.theValue("lestyon").into(UtestJoinPage.INPUT_FIRST_NAME),
                Enter.theValue("lizarazo").into(UtestJoinPage.INPUT_LAST_NAME),
                Enter.theValue("leyston52@hotmail.com").into(UtestJoinPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("May").from(UtestJoinPage.SELECT_MONTH_BIRTH),
                SelectFromOptions.byVisibleText("2").from(UtestJoinPage.SELECT_DAY_BIRTH),
                SelectFromOptions.byVisibleText("1996").from(UtestJoinPage.SELECT_YEAR_BIRTH),
                Click.on(UtestJoinPage.BUTTON_NEXT_LOCATION),
                Click.on(UtestJoinPage.BUTTON_NEXT_DEVICE)
                );
    }
}
