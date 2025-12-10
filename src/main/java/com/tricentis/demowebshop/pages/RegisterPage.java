package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.browserfactory.ManageBrowser;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @FindBy(id = "gender-male")
    WebElement maleRadio;

    @FindBy(id = "gender-female")
    WebElement femaleRadio;

    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @FindBy(id = "LastName")
    WebElement lastNameField;

    @FindBy(name = "DateOfBirthDay")
    WebElement birthDayDropdown;

    @FindBy(name = "DateOfBirthMonth")
    WebElement birthMonthDropdown;

    @FindBy(name = "DateOfBirthYear")
    WebElement birthYearDropdown;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @FindBy(id = "register-button")
    WebElement registerButton;

    // Error messages
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;

    @FindBy(id = "LastName-error")
    WebElement lastNameError;

    @FindBy(id = "Email-error")
    WebElement emailError;

    @FindBy(id = "Password-error")
    WebElement passwordError;

    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;

    // Success Message
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompletedMessage;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    // Actions
    public String getRegisterHeader() { return getTextFromElement(registerText); }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("male")) clickOnElement(maleRadio);
        else clickOnElement(femaleRadio);
    }

    public void enterFirstName(String fname) {
        sendTextToElement(firstNameField, fname);
    }

    public void enterLastName(String lname) {
        sendTextToElement(lastNameField, lname);
    }

    public void selectBirthDay(String day) { selectByVisibleTextFromDropDown(birthDayDropdown, day); }

    public void selectBirthMonth(String month) { selectByVisibleTextFromDropDown(birthMonthDropdown, month); }

    public void selectBirthYear(String year) { selectByVisibleTextFromDropDown(birthYearDropdown, year); }

    public void enterEmail(String email) { sendTextToElement(emailField, email); }

    public void enterPassword(String pwd) { sendTextToElement(passwordField, pwd); }

    public void enterConfirmPassword(String cpwd) { sendTextToElement(confirmPasswordField, cpwd); }

    public void clickRegisterButton() { clickOnElement(registerButton); }

    public String getRegistrationSuccessMessage() { return getTextFromElement(registrationCompletedMessage); }

    public void clickContinueButton() { clickOnElement(continueButton); }

    // Error text methods
    public String getFirstNameError() { return getTextFromElement(firstNameError); }

    public String getLastNameError() { return getTextFromElement(lastNameError); }

    public String getEmailError() { return getTextFromElement(emailError); }

    public String getPasswordError() { return getTextFromElement(passwordError); }

    public String getConfirmPasswordError() { return getTextFromElement(confirmPasswordError); }
}
