package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='User Management']")
    WebElement userManagement;

    @CacheLookup
    @FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab --parent']")
    WebElement job;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Organization']")
    WebElement organization;

    public void clickOnUserManagement() {
        clickOnElement(userManagement);
    }

    public void clickOnJob() {
        clickOnElement(job);
    }

    public void clickOnOrganization() {
        clickOnElement(organization);
    }

}
