package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class LoginSteps {

        HomePage home = new HomePage(Hooks.driver);
        LoginPage login = new LoginPage(Hooks.driver);

        @Given("I am on the home page")
        public void i_am_on_the_home_page() {
        }

        @When("I click on the Login link")
        public void i_click_on_the_login_link() {
            home.clickLoginLink();
        }

        @Then("I should see the message {string}")
        public void i_should_see_the_message(String expected) {
            Assert.assertEquals(login.getWelcomeText(), expected);
        }

        @When("I enter email {string}")
        public void i_enter_email(String email) {
            login.enterEmail(email);
        }

        @When("I enter password {string}")
        public void i_enter_password(String password) {
            login.enterPassword(password);
        }

        @When("I click on the Login button")
        public void i_click_on_the_login_button() {
            login.clickLoginButton();
        }

        @Then("I should see an error message {string}")
        public void i_should_see_an_error_message(String text) {
            Assert.assertTrue(login.getErrormsg().contains(text));
        }

        @Then("I should see Logout link displayed")
        public void i_should_see_logout_link_displayed() {
            Assert.assertTrue(home.isLogoutDisplayed());
        }

        @When("I click on the Logout link")
        public void i_click_on_the_logout_link() {
            home.clickLogout();
        }

        @Then("I should see Login link displayed")
        public void i_should_see_login_link_displayed() {
            Assert.assertTrue(home.isLoginDisplayed());
        }
    }


