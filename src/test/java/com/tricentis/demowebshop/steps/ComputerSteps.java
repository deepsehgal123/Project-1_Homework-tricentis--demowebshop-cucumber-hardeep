package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.BuildYourOwnComputerPage;
import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.pages.DesktopsPage;
import com.tricentis.demowebshop.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {

    HomePage home = new HomePage(Hooks.driver);
    ComputerPage computer = new ComputerPage(Hooks.driver);
    DesktopsPage desktops = new DesktopsPage(Hooks.driver);
    BuildYourOwnComputerPage build = new BuildYourOwnComputerPage(Hooks.driver);

    @When("I click on the Computer tab")
    public void click_computer_tab() {
        // Fixed method name (ensure HomePage has this method)
        home.clickComputersMenu("Computers");
    }

    @Then("I should see {string}")
    public void should_see_text(String text) {
        Assert.assertTrue(Hooks.driver.getPageSource().contains(text));
    }

    @When("I click on the Desktops link")
    public void click_desktops() {
        computer.clickDesktops();
    }

    @When("I click on {string}")
    public void click_product(String product) {
        // Fixed method name (capital P)
        desktops.selectFirstProduct(product);
    }

    @When("I select processor {string}")
    public void select_processor(String processor) {
        build.selectProcessor(processor);
    }

    @When("I select RAM {string}")
    public void select_ram(String ram) {
        build.selectRam(ram);
    }

    @When("I select HDD {string}")
    public void select_hdd(String hdd) {
        build.selectHDD(hdd);
    }

    @When("I select OS {string}")
    public void select_os(String os) {
        build.selectOS(os);
    }

    @When("I select Software {string}")
    public void select_software(String software) {
        build.selectSoftware(software);
    }

    @When("I click on ADD TO CART button")
    public void click_add_to_cart() {
        build.clickAddToCart();
    }

    @Then("I should see add to cart message {string}")
    public void verify_add_to_cart_message(String expected) {
        Assert.assertTrue(build.getsuccessmsg().contains(expected));
    }
}

