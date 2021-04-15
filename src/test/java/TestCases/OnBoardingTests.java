package TestCases;

import Data.LoginPageData;
import Data.WelcomePageData;
import Data.UserData;
import PageObjectClasses.LoginPage;
import PageObjectClasses.OnboardingScreen;
import PageObjectClasses.RegistrationPage;
import PageObjectClasses.WelcomePage;
import TestMethods.UsefulMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnBoardingTests extends UsefulMethods {

    //Ensure the details provided in User Data class are for a new account, that is not pre-existing.
    @Test
    public void UserCanRegisterNewUser() {
        RegistrationPage.brandingLogo(wait);

        RegistrationPage.emailField(driver).sendKeys(UserData.registerEmailAddress);
        Assert.assertEquals(RegistrationPage.emailField(driver).getText(), UserData.registerEmailAddress);

        RegistrationPage.passwordField(driver).sendKeys(UserData.registerPassword);
        RegistrationPage.confirmPasswordField(driver).sendKeys(UserData.registerPassword);
        RegistrationPage.showPasswordButton(driver).click();
        Assert.assertEquals(RegistrationPage.passwordField(driver).getText(), UserData.registerPassword);
        Assert.assertEquals(RegistrationPage.confirmPasswordField(driver).getText(), UserData.registerPassword);

        RegistrationPage.firstNameField(driver).sendKeys(UserData.firstName);
        Assert.assertEquals(RegistrationPage.firstNameField(driver).getText(), UserData.firstName);

        RegistrationPage.lastNameField(driver).sendKeys(UserData.lastName);
        Assert.assertEquals(RegistrationPage.lastNameField(driver).getText(), UserData.lastName);

        RegistrationPage.postalCodeField(driver).sendKeys(UserData.postCode);
        Assert.assertEquals(RegistrationPage.postalCodeField(driver).getText(), UserData.postCode);

        RegistrationPage.checkbox(driver).click();
        Assert.assertTrue(RegistrationPage.checkbox(driver).isEnabled());

        RegistrationPage.registerButton(driver).click();
        WelcomePage.waitForWelcomeImage(wait);
        Assert.assertTrue(WelcomePage.welcomeImage(driver).isDisplayed());
    }

    //Test valid for a registered user who has not been through onboarding process before.
    @Test
    public void RegisteredUserCanOnboardThroughWelcomeScreenFirstTime() {
        RegistrationPage.brandingLogo(wait);

        ScrollToAlreadyRegistered(driver);

        RegistrationPage.alreadyRegisteredButton(driver).click();

        LoginPage.waitLoginHeader(wait);
        Assert.assertEquals(LoginPage.loginHeader(driver).getText(), LoginPageData.loginHeader);

        LoginPage.emailfield(driver).sendKeys(UserData.registerEmailAddress);
        Assert.assertEquals(LoginPage.emailfield(driver).getText(), UserData.registerEmailAddress);

        LoginPage.passwordField(driver).sendKeys(UserData.registerPassword);
        LoginPage.showPasswordButton(driver).click();
        Assert.assertEquals(LoginPage.passwordField(driver).getText(), UserData.registerPassword);

        LoginPage.loginButton(driver).click();

        WelcomePage.waitForWelcomeImage(wait);
        Assert.assertTrue(WelcomePage.welcomeImage(driver).isDisplayed());
        Assert.assertEquals(WelcomePage.welcomeGreeting(driver).getText(), WelcomePageData.welcomePageHeader);
        Assert.assertEquals(WelcomePage.welcomeBody(driver).getText(), WelcomePageData.welcomePageBody);

        WelcomePage.nextButton(driver).click();
        Assert.assertTrue(WelcomePage.welcomeImage(driver).isDisplayed());
        Assert.assertEquals(WelcomePage.welcomeGreeting(driver).getText(), WelcomePageData.secondPageHeader);
        Assert.assertEquals(WelcomePage.welcomeBody(driver).getText(), WelcomePageData.secondPageBody);

        WelcomePage.continueButton(driver).click();

        OnboardingScreen.permissionIcon(driver).isDisplayed();
    }

}
