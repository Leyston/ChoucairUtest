package co.com.choucair.certification.utestuser.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLoginPage {

    public static final Target LOGIN_BUTTON = Target.the("Button that shows us the form to login")
            .located(By.xpath("//a[contains(text(),'Log In')]"));
    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login")
            .located(By.id("kc-login"));
    public static final Target EMIL_NAME = Target.the("Extract the email")
            .located(By.xpath("//span"));
}
