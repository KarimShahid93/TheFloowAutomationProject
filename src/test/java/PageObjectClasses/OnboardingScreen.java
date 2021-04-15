package PageObjectClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnboardingScreen {

    public static WebElement waitForOnboardingImage(WebDriverWait wait){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.thefloow.thefloowltd.floowdrivedemo.app:id/branding_logo")));
    }

    public static WebElement onboardingCloseButton(AndroidDriver driver){
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/close_button");
    }

    public static WebElement permissionIcon(AndroidDriver driver){
        return driver.findElementById("com.android.permissioncontroller:id/permission_icon");
    }


}
