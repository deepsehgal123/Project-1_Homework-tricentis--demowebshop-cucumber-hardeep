package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.browserfactory.ManageBrowser;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {

    public DesktopsPage(WebDriver driver) {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;

    @FindBy(id = "products-orderby")
    WebElement sortByDropdown;

    @FindBy(id = "products-pagesize")
    WebElement displayDropdown;

    @FindBy(css = "div.product-item")
    WebElement productList;

    public String getDesktopsHeader() {
        return getTextFromElement(desktopsText);
    }

    public void selectSortBy(String option) {
        selectByVisibleTextFromDropDown(sortByDropdown, option);
    }

    public void selectDisplay(String option) {
        selectByVisibleTextFromDropDown(displayDropdown, option);
    }

    public void selectFirstProduct(String product) {
        clickOnElement(productList);
    }
}
