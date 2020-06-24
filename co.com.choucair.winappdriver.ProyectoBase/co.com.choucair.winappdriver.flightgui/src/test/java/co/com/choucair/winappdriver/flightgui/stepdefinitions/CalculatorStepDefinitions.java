package co.com.choucair.winappdriver.flightgui.stepdefinitions;

import co.com.choucair.winappdriver.flightgui.models.DataModel;
import co.com.choucair.winappdriver.flightgui.questions.VerifyWith;
import co.com.choucair.winappdriver.flightgui.tasks.DataCal;
import co.com.choucair.winappdriver.flightgui.utils.DriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CalculatorStepDefinitions {

    @Given("^that (.*) wants to enter to use the Calculator$")
    public void thatBrandonWantsToEnterToUseTheCalculator(String brandon) {
        theActorCalled(brandon).can(BrowseTheWeb.with(DriverManager.abrirCalculadoraWindows()));

    }

    @When("^he enters the data into the calculator$")
    public void heEntersTheDataIntoTheCalculator(List<DataModel> dataSet) {
        OnStage.theActorInTheSpotlight().attemptsTo(DataCal.with(dataSet));
    }

    @Then("^he verifies that the result of the mathematical operation is equal to (.*)$")
    public void heVerifiesThatTheResultOfTheMathematicalOperationIsEqualTo(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyWith.the(question)));
    }


}

