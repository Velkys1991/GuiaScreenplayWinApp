package co.com.choucair.winappdriver.flightgui.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.winappdriver.flightgui.userinterfaces.CalculatorPage.RESULTS;


public class VerifyWith implements Question<Boolean> {

    private String question;

    public VerifyWith(String question) {
        this.question = question;
    }

    public static VerifyWith the(String question) {
        return new VerifyWith(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String answer = Text.of(RESULTS).viewedBy(actor).asString();
        return question.contains(answer);
    }
}
