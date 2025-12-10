package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.browserfactory.ManageBrowser;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    // 7 Menu Locators
    @FindBy(linkText = "Computers") WebElement computersMenu;
    @FindBy(linkText = "Electronics") WebElement electronicsMenu;
    @FindBy(linkText = "Apparel & Shoes") WebElement apparelShoesMenu;
    @FindBy(linkText = "Digital downloads") WebElement digitalDownloadsMenu;
    @FindBy(linkText = "Books") WebElement booksMenu;
    @FindBy(linkText = "Jewelry") WebElement jewelryMenu;
    @FindBy(linkText = "Gift Cards") WebElement giftCardsMenu;

    // Other Locators
    @FindBy(className = "ico-login") WebElement loginLink;
    @FindBy(className = "ico-register") WebElement registerLink;
    @FindBy(css = "img[alt='Tricentis Demo Web Shop']") WebElement nopCommerceLogo;
    @FindBy(className = "ico-account") WebElement myAccountLink;
    @FindBy(className = "ico-logout") WebElement logoutLink;

    // Actions
    public void clickLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickComputersMenu(String computers) {
        clickOnElement(computersMenu);
    }

    public void clickElectronicsMenu() { clickOnElement(electronicsMenu); }

    public void clickApparelShoesMenu() { clickOnElement(apparelShoesMenu); }

    public void clickDigitalDownloadsMenu() { clickOnElement(digitalDownloadsMenu); }

    public void clickBooksMenu() { clickOnElement(booksMenu); }

    public void clickJewelryMenu() { clickOnElement(jewelryMenu); }

    public void clickGiftCardsMenu() { clickOnElement(giftCardsMenu); }

    public boolean isLogoDisplayed() {
        return verifyThatElementIsDisplayed(nopCommerceLogo);
    }

    public void clickLogout() {
        clickOnElement(logoutLink);
    }

    public void clickMyAccount() {
        clickOnElement(myAccountLink);
    }

    public boolean isLogoutDisplayed() {
        return false;
    }

    public boolean isLoginDisplayed() {
        return false;
    }
}
