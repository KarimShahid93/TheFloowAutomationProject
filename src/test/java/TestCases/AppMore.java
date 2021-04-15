package TestCases;

import Data.MorePageData;
import Data.UserData;
import PageObjectClasses.ChangePasswordPage;
import PageObjectClasses.MainPageObjects;
import PageObjectClasses.MoreMenuPage;
import PageObjectClasses.PreferencesPage;
import TestMethods.UsefulMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppMore extends UsefulMethods {

    //Ensure the current password is up to date before running this test.
    @Test
    public void UserCanNavigateToPreferencesPage(){
        UserLogin();
        MainPageObjects.moreMenuButton(driver).click();

        Assert.assertEquals(MoreMenuPage.navigationTitle(driver).getText(), MorePageData.moreNavigationTitle);

        MoreMenuPage.preferencesButton(driver).click();
        Assert.assertEquals(PreferencesPage.preferencesNavigationTitle(driver).getText(),MorePageData.preferencesNavigationTitle);
    }

    //Ensure the current password is upto date before running this test.
    @Test
    public void UserCanChangeCurrentPassword(){
        UserLogin();
        MainPageObjects.moreMenuButton(driver).click();

        Assert.assertEquals(MoreMenuPage.navigationTitle(driver).getText(), MorePageData.moreNavigationTitle);

        MoreMenuPage.changePasswordButton(driver).click();
        Assert.assertEquals(ChangePasswordPage.changePasswordNavigationTitle(driver).getText(), UserData.changePasswordNavigationTitle);

        ChangePasswordPage.currentPasswordField(driver).sendKeys(UserData.currentPassword);
        ChangePasswordPage.showCurrentPasswordButton(driver).click();
        Assert.assertEquals(ChangePasswordPage.currentPasswordField(driver).getText(),UserData.currentPassword);

        ChangePasswordPage.newPasswordField(driver).sendKeys(UserData.newPassword);
        ChangePasswordPage.newPasswordRepeatField(driver).sendKeys(UserData.newPassword);
        ChangePasswordPage.showNewPasswordButton(driver).click();
        Assert.assertEquals(ChangePasswordPage.newPasswordField(driver).getText(),UserData.newPassword);
        Assert.assertEquals(ChangePasswordPage.newPasswordRepeatField(driver).getText(),UserData.newPassword);

        ChangePasswordPage.changeItButton(driver).click();
        ChangePasswordPage.waitForSuccessMessage(wait);
        Assert.assertEquals(ChangePasswordPage.successMessage(driver).getText(),UserData.changePasswordSuccessMessage);
    }
}
