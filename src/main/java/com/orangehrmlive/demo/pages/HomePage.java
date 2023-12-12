package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search;

    @CacheLookup
    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    WebElement admin;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement pIM;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Leave']")
    WebElement leave;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']")
    WebElement dashboard;

    @CacheLookup
    @FindBy(xpath = "(//img[@alt='orangehrm-logo'])[2]")
    WebElement orangeHrmLogo;
    @CacheLookup
    @FindBy()
    WebElement welcomeText;

    public void clickOnSearch() {
        clickOnElement(search);
    }

    public void clickOnAdmin() {
        clickOnElement(admin);
    }

    public void clickOnPIM() {
        clickOnElement(pIM);
    }

    public void clickOnLeave() {
        clickOnElement(leave);
    }

    public void clickOnDashboard() {
        clickOnElement(dashboard);
    }

    public void verifyOrangeHrmLogo() {
        boolean logoPresent = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
        Assert.isTrue(true, "Error", logoPresent);
    }
}
