package PageObjectClasses;

import io.appium.java_client.android.AndroidDriver;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public static WebElement waitLoginHeader(WebDriverWait wait){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")));
    }

    //Login Header
    public static WebElement loginHeader(AndroidDriver driver){
        return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
    }

    //Email Field
    public static WebElement emailfield(AndroidDriver driver){
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/email_input");
    }

    //Password Field
    public static WebElement passwordField(AndroidDriver driver){
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/unknown_input");
    }

    //Show Password Button:
    public static WebElement showPasswordButton(AndroidDriver driver){
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/password_show");
    }

    //Login Button
    public static WebElement loginButton(AndroidDriver driver){
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/btn_login");
    }

    //Forgotten Password Button
    public static WebElement forgottenPasswordButton(AndroidDriver driver){
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/btn_forgot_password");
    }
}
