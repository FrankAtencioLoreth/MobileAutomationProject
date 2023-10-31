package starter.stepDefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    public static Actor actor;

    @Before
    public void setUp() {
        Hooks.actor = Actor.named("Batman");
        OnStage.setTheStage(new OnlineCast());
    }

}
