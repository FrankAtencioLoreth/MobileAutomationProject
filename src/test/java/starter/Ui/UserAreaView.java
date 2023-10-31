package starter.Ui;

import net.serenitybdd.screenplay.targets.Target;

public class UserAreaView {
    public static final Target welcomeText = Target.the("Welcome text").locatedBy("//android.widget.TextView[contains(@text,'Secret Area')]");

}
