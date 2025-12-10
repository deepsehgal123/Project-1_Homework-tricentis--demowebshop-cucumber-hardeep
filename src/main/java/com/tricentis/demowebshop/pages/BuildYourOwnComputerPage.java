package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.browserfactory.ManageBrowser;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collection;

public class BuildYourOwnComputerPage extends Utility {

    public BuildYourOwnComputerPage(WebDriver driver) {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourComputerText;

    @FindBy(id = "product_attribute_1")
    WebElement processorDropdown;

    @FindBy(id = "product_attribute_2")
    WebElement ramDropdown;

    @FindBy(id = "product_attribute_3_6")
    WebElement hdd320GB;

    @FindBy(id = "product_attribute_3_7")
    WebElement hdd400GB;

    @FindBy(id = "product_attribute_4_8")
    WebElement osVistaHome;

    @FindBy(id = "product_attribute_4_9")
    WebElement osVistaPremium;

    @FindBy(id = "product_attribute_5_10")
    WebElement softwareOffice;

    @FindBy(id = "product_attribute_5_11")
    WebElement softwareAcrobat;

    @FindBy(id = "product_attribute_5_12")
    WebElement softwareCommander;

    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddedMessage;

    public String getHeaderText() {
        return getTextFromElement(buildYourComputerText);
    }

    public void selectProcessor(String text) {
        selectByVisibleTextFromDropDown(processorDropdown, text);
    }

    public void selectRam(String text) {
        selectByVisibleTextFromDropDown(ramDropdown, text);
    }

    public void selectHDD(String size) {
        if (size.equalsIgnoreCase("320 GB")) clickOnElement(hdd320GB);
        else clickOnElement(hdd400GB);
    }

    public void selectOS(String os) {
        if (os.equalsIgnoreCase("Vista Home")) clickOnElement(osVistaHome);
        else clickOnElement(osVistaPremium);
    }

    public void selectSoftware(boolean office, boolean acrobat, boolean commander) {
        if (office) clickOnElement(softwareOffice);
        if (acrobat) clickOnElement(softwareAcrobat);
        if (commander) clickOnElement(softwareCommander);
    }

    public void clickAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String getProductAddedMessage() {
        return getTextFromElement(productAddedMessage);
    }

    public Collection<Object> getsuccessmsg() {
        return java.util.List.of();
    }

    public void selectSoftware(String software) {
    }
}
