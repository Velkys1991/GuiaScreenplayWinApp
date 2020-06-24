package co.com.choucair.winappdriver.flightgui.tasks;

import co.com.choucair.winappdriver.flightgui.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.winappdriver.flightgui.userinterfaces.CalculatorPage.*;
import static co.com.choucair.winappdriver.flightgui.utils.Constants.Zero;

public class DataCal implements Task {
    private List<DataModel> dataSet;

    public DataCal(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static DataCal with(List<DataModel> dataSet) {
        return Tasks.instrumented(DataCal.class, dataSet);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataSet.get(Zero).getValor1()).into(INTO_VALOR1),
                Click.on(PLUS),
                Enter.theValue(dataSet.get(Zero).getValor2()).into(INTO_VALOR2),
                Click.on(DIVIDE),
                Enter.theValue(dataSet.get(Zero).getValor3()).into(INTO_VALOR3),
                Click.on(EQUAL)

        );

    }
}
