package PageObjectClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    public static WebElement waitForHomePageDial(WebDriverWait wait) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.thefloow.thefloowltd.floowdrivedemo.app:id/dial")));
    }

    public static WebElement homepageDial(AndroidDriver driver) {
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/dial");
    }

    public static WebElement nextButton(AndroidDriver driver) {
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/btn_next");
    }

    public static WebElement previousButton(AndroidDriver driver) {
        return driver.findElementById("com.thefloow.thefloowltd.floowdrivedemo.app:id/btn_prev");
    }
}