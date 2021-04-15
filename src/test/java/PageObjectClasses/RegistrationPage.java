package PageObjectClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    public static WebElement brandingLogo(WebDriverWait wait){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.thefloow.thefloowltd.floowdrivedemo.app:id/branding_logo")));
    }

    public static WebElement emailField(AndroidDriver driver) {
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/email_input");
    }

    public static WebElement passwordField(AndroidDriver driver) {
        return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.EditText");
    }

    public static WebElement confirmPasswordField(AndroidDriver driver) {
        return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.EditText");
    }

    public static WebElement showPasswordButton(AndroidDriver driver) {
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/password_show");
    }

    public static WebElement firstNameField(AndroidDriver driver) {
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/name_input");
    }

    public static WebElement lastNameField(AndroidDriver driver) {
        return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.EditText");
    }

    public static WebElement postalCodeField(AndroidDriver driver) {
        return driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.EditText");
    }

    public static WebElement checkbox(AndroidDriver driver){
    return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/chk_agree");
    }

    public static WebElement registerButton(AndroidDriver driver)
    {
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/btn_register");
    }

    public static WebElement alreadyRegisteredButton(AndroidDriver driver){
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/btn_already_registered");
    }
}


