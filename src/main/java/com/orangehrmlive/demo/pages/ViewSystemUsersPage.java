package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUsersPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUsers;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
    WebElement userRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[2]")
    WebElement status;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;

    @CacheLookup
    @FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
    WebElement deleteButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span']")
    WebElement recordFound;
    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'Admin')])[2]")
    WebElement textAdmin;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement tickOnCheckBox;

    public String verifyTextSystemUsers() {
        return getTextFromElement(systemUsers);
    }

    public void enterUserName(String userName) {
        sendTextToElement(usernameField, userName);
    }

    public void selectUserRoll() {
        sendTextToElement(userRole, "Admin");
    }

    public void enterEmployeeName(String name) {
        sendTextToElement(employeeName, name);
    }

    public void selectStatusFromDropdown() {
        sendTextToElement(status, "Enabled");
    }

    public void clickOnSearchButton() {
        mouseHoverToElementAndClick(searchButton);
    }

    public void clickOnResetButton() {
        clickOnElement(resetButton);
    }

    public void clickOnAddButton() {
        clickOnElement(addButton);
    }
    public String verifyTextDeletedSuccessfully() {
        return getTextFromElement(recordFound);
    }

    public String verifyTextRecordFound() {
        return getTextFromElement(recordFound);
    }

    public String verifyTextAdmin() {
        return getTextFromElement(textAdmin);
    }

    public void tickOnCheckBox(){
        clickOnElement(tickOnCheckBox);
    }
    public void clickOnDeleteButton(){
        clickOnElement(deleteButton);
    }

}
