package starter.Ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginView {

    public static Target username = Target.the("Username").located(AppiumBy.accessibilityId("username"));
    public static Target password = Target.the("Password").located(AppiumBy.accessibilityId("password"));
    public static Target loginButton = Target.the("LoginButton").locatedBy("//android.view.ViewGroup[@content-desc=\"loginBtn\"]/android.widget.TextView");
}
