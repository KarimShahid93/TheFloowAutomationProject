package PageObjectClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage {

    public static WebElement waitForWelcomeImage(WebDriverWait wait){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.thefloow.thefloowltd.floowdrivedemo.app:id/welcome_page_image")));
    }

    public static WebElement welcomeImage(AndroidDriver driver){
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/welcome_page_image");
    }

    public static WebElement welcomeGreeting(AndroidDriver driver){
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/welcome_page_header");
    }

    public static WebElement welcomeBody(AndroidDriver driver){
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/welcome_page_body");
    }

    public static WebElement nextButton(AndroidDriver driver){
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/welcome_next_button");
    }

    public static WebElement continueButton(AndroidDriver driver){
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/welcome_continue_button");
    }


}
