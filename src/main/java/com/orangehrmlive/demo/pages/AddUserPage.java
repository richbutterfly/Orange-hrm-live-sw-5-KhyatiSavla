package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
    WebElement userRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[2]")
    WebElement status;

    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement cancelButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']")
    WebElement textSuccessfullySaved;

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement textAddUser;


    public void selectUserRoll() {
        selectByVisibleTextFromDropDown(userRole, "Admin");
    }

    public void enterUserName(String userName) {
        sendTextToElement(usernameField, userName);
    }

    public void enterEmployeeName(String name) {
        sendTextToElement(employeeName, name);
    }

    public void SelectStatusFromDropdown() {
        selectByVisibleTextFromDropDown(status, "Enabled");
    }

    public void enterPassword(String passWord) {
        sendTextToElement(password, passWord);
    }

    public void enterConfirmPassword(String confirmPassWord) {
        sendTextToElement(confirmPassword, confirmPassWord);
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);
    }

    public void clickOnCancelButton() {
        clickOnElement(cancelButton);
    }

    public String verifyTextSuccessfullySaved() {
        return getTextFromElement(textSuccessfullySaved);
    }

    public String verifyTextAddUser() {
        return getTextFromElement(textAddUser);
    }

}
