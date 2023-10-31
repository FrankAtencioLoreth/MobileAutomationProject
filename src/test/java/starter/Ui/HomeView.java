package starter.Ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeView {

    public static Target loginLink = Target.the("Login Link").locatedBy("//android.view.ViewGroup[@content-desc=\"Login Screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
}
