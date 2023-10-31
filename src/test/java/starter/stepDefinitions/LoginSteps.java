package starter.stepDefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.Ui.UserAreaView;
import starter.tasks.Login;
import starter.tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginSteps {

    @Given("User wants login")
    public void userWantsLogin() {
        theActorCalled(Hooks.actor.getName()).attemptsTo(
                new NavigateTo()
        );
    }

    @When("he sends his credentials")
    public void heSendsHisCredentials() {
        theActorInTheSpotlight().attemptsTo(
                new Login()
        );
    }

    @Then("he should see the dashboard")
    public void heShouldSeeTheDashboard() {
        String textExpected = "You are logged in as alice";
        Ensure.that(UserAreaView.welcomeText).text()
                .isEqualTo(textExpected);
    }
}
