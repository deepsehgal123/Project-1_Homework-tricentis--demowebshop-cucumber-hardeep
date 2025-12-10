package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.browserfactory.ManageBrowser;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

    public ComputerPage(WebDriver driver) {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;

    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @FindBy(linkText = "Notebooks")
    WebElement notebooksLink;

    @FindBy(linkText = "Software")
    WebElement softwareLink;

    public String getComputersHeader() {
        return getTextFromElement(computersText);
    }

    public void clickDesktops() {
        clickOnElement(desktopsLink);
    }

    public void clickNotebooks() {
        clickOnElement(notebooksLink);
    }

    public void clickSoftware() {
        clickOnElement(softwareLink);
    }
}
