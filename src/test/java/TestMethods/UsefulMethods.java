package TestMethods;

import Data.LoginPageData;
import Data.UserData;
import PageObjectClasses.HomePage;
import PageObjectClasses.LoginPage;
import PageObjectClasses.OnboardingScreen;
import PageObjectClasses.RegistrationPage;
import Utiltiies.DriverUtilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UsefulMethods extends DriverUtilities {

    public void ScrollToAlreadyRegistered(AndroidDriver driver){
        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                        ".scrollIntoView(new UiSelector().text(\"Already Registered\"))"));
    }

    public void UserLogin(){
        RegistrationPage.brandingLogo(wait);

        ScrollToAlreadyRegistered(driver);

        RegistrationPage.alreadyRegisteredButton(driver).click();

        LoginPage.waitLoginHeader(wait);
        Assert.assertEquals(LoginPage.loginHeader(driver).getText(), LoginPageData.loginHeader);

        LoginPage.emailfield(driver).sendKeys(UserData.currentEmailAddress);
        Assert.assertEquals(LoginPage.emailfield(driver).getText(), UserData.currentEmailAddress);

        LoginPage.passwordField(driver).sendKeys(UserData.currentPassword);
        LoginPage.showPasswordButton(driver).click();
        Assert.assertEquals(LoginPage.passwordField(driver).getText(), UserData.currentPassword);

        LoginPage.loginButton(driver).click();
        OnboardingScreen.waitForOnboardingImage(wait);
        OnboardingScreen.onboardingCloseButton(driver).click();
        HomePage.waitForHomePageDial(wait);
    }
}
