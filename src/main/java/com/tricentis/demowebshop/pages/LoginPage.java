package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.browserfactory.ManageBrowser;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collection;

public class LoginPage extends Utility {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    // Locators
    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(css = "input.login-button")
    WebElement loginButton;

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeSignInText;

    // Actions
    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickLoginButton() {
        clickOnElement(loginButton);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeSignInText);
    }

    public Collection<Object> getErrormsg() {
        return null;
    }
}
