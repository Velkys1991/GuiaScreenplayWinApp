package co.com.choucair.winappdriver.flightgui.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CalculatorPage {

    public static final Target INTO_VALOR1 = Target.the("Ingresar Valor 1")
            .located(By.xpath("//*[@AutomationId='CalculatorResults']"));

    public static final Target PLUS = Target.the("Click Plus")
            .located(By.xpath("//*[@AutomationId='plusButton']"));

    public static final Target INTO_VALOR2 = Target.the("Ingresar Valor 2")
            .located(By.xpath("//*[@AutomationId='CalculatorResults']"));

    public static final Target DIVIDE = Target.the("Click Divide")
            .located(By.xpath("//*[@AutomationId='divideButton']"));

    public static final Target INTO_VALOR3 = Target.the("Ingresar Valor 3")
            .located(By.xpath("//*[@AutomationId='CalculatorResults']"));

    public static final Target EQUAL= Target.the("Click Divide")
            .located(By.xpath("//*[@AutomationId='equalButton']"));

    public static final Target RESULTS = Target.the("verificar el resultado")
            .located(By.xpath("//*[@AutomationId='CalculatorResults']"));
}

