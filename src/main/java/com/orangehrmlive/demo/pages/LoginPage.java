package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement loginText;
    @CacheLookup
    @FindBy(name = "username")
    WebElement username;
    @CacheLookup
    @FindBy(name = "password")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement textInvalidCredentials;


    public void enterUsername(String userId) {
        sendTextToElement(username, userId);
    }

    public void enterPassword(String passWord) {
        sendTextToElement(password, passWord);
    }

    public String verifyTextLogin() {
        return getTextFromElement(loginText);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void loginSuccessfully(String userName, String passWord) {
        sendTextToElement(username, userName);
        sendTextToElement(password, passWord);
        clickOnElement(loginButton);
    }
    public String verifyTextInvalidCredentials() {
        return getTextFromElement(textInvalidCredentials);
    }
}