package starter.stepDefinitions;

import starter.Tasks.Login;
import starter.Tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps {

    @Given("User wants login")
    public void userWantsLogin() {
        theActorCalled("Batman").attemptsTo(
                new NavigateTo()
        );
    }

    @When("he sends his credentials")
    public void heSendsHisCredentials() {
        theActorInTheSpotlight().attemptsTo(
                new Login()
        );
    }
}
