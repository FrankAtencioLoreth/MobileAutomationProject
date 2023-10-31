package starter.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.Ui.LoginView;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("alice").into(LoginView.username),
                SendKeys.of("mypassword").into(LoginView.password),
                Click.on(LoginView.loginButton)
        );
    }
}
