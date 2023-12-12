package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement textDashboard;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement userProfileLogo;

    @CacheLookup
    @FindBy (linkText = "Logout")
    WebElement logout;


    public String verifyTextDashboard() {
        return getTextFromElement(textDashboard);
    }

    public void clickOnUserProfileLogo() {
        clickOnElement(userProfileLogo);
    }

    public void clickOnLogout() {
        mouseHoverToElementAndClick(logout);
    }
}
