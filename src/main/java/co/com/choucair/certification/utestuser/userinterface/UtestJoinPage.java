package co.com.choucair.certification.utestuser.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinPage {

    public static final Target BUTTON_JOIN = Target.the("Button that shows the create account")
            .located(By.xpath("//a[contains(text(),'Join Today')]"));
    public static final Target INPUT_FIRST_NAME = Target.the("Where to write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Where to write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Where to write the email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH_BIRTH = Target.the("Select the month of birth")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY_BIRTH = Target.the("Select the day of birth")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR_BIRTH = Target.the("Select the year of birth")
            .located(By.id("birthYear"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("Button to continue the process")
            .located(By.xpath("//a[@class = 'btn btn-blue']//span[contains(text(), 'Next: Location')]"));
    public static final Target INPUT_CITY = Target.the("Where to wirte the email")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Where to write the zip code")
            .located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("Select the country options")
            .located(By.xpath("//div[@name = 'countryId']"));
    public static final Target INPUT_COUNTRY = Target.the("Write the country")
            .located(By.xpath("//input[@placeholder = 'Select a country']"));
    public static final Target BUTTON_NEXT_DEVICE = Target.the("Button to continue to devices")
            .located(By.xpath("//a[@class = 'btn btn-blue pull-right']//span[contains(text(), 'Next: Devices')]"));
    public static final Target SELECT_OS = Target.the("Select the OS options")
            .located(By.xpath("//div[@name = 'osId']"));
    public static final Target INPUT_OS = Target.the("Write the OS")
            .located(By.xpath("//input[@placeholder = 'Select OS']"));
    public static final Target SELECT_OS_VERSION = Target.the("Select the OS version option")
            .located(By.xpath("//div[@name = 'osVersionId']"));
    public static final Target INPUT_OS_VERSION = Target.the("Write the OS version")
            .located(By.xpath("//input[@placeholder = 'Select a Version']"));
    public static final Target SELECT_OS_LANGUAGE = Target.the("Select the OS language")
            .located(By.xpath("//div[@name = 'osLanguageId']"));
    public static final Target INPUT_OS_LANGUAGE = Target.the("Write the OS language")
            .located(By.xpath("//input[@placeholder = 'Select OS language']"));
    public static final Target BUTTON_NEXT_LAST_STEP = Target.the("Button to continue the process")
            .located(By.xpath("//a[@class = 'btn btn-blue pull-right']//span[contains(text(), 'Next: Last Step')]"));
    public static final Target INPUT_PASSWORD = Target.the("Where to write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Where to write the password")
            .located(By.id("confirmPassword"));
    public static final Target INPUT_TERMS_OF_USE = Target.the("Where to write the password")
            .located(By.id("termOfUse"));
    public static final Target INPUT_PRIVACY_SETTING = Target.the("Where to write the password")
            .located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("Button to continue the process")
            .located(By.xpath("//a[@class = 'btn btn-blue']//span[contains(text(), 'Complete Setup')]"));

}
