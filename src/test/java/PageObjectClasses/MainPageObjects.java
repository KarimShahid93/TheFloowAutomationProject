package PageObjectClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class MainPageObjects {

    public static WebElement homePageButton(AndroidDriver driver){
        return driver.findElementByAccessibilityId("Dashboard");
    }

    public static WebElement journeyListButton(AndroidDriver driver){
        return driver.findElementByAccessibilityId("JourneyList");
    }

    public static WebElement moreMenuButton(AndroidDriver driver){
        return driver.findElementByAccessibilityId("More");
    }


}
