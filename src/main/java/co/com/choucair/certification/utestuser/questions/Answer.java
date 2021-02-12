package co.com.choucair.certification.utestuser.questions;

import co.com.choucair.certification.utestuser.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String emailName = Text.of(UtestLoginPage.EMIL_NAME).viewedBy(actor).asString();
        if (question.equals(emailName)) result = true;
        else result = false;
        return result;

    }
}
