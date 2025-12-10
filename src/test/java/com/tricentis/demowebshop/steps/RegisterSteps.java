package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {

    HomePage home = new HomePage(Hooks.driver);
        RegisterPage register = new RegisterPage(Hooks.driver);
        String uniqueEmail;

        @When("I click on the Register link")
        public void clickRegister() {
            home.clickRegisterLink();
        }

        @Then("I should see {string}")
        public void i_should_see(String expected) {
            Assert.assertEquals(register.getRegisterHeader(), expected);
        }

        @When("I click on the Register button")
        public void i_click_on_the_register_button() {
            register.clickRegisterButton();
        }

        @Then("I should see error {string}")
        public void i_should_see_error(String expected) {
            Assert.assertTrue(register.getRegisterHeader().contains(expected));
        }

        @When("I select gender {string}")
        public void select_gender(String gender) {
            register.selectGender(gender);
        }

        @When("I enter firstname {string}")
        public void enter_firstname(String fname) {
            register.enterFirstName(fname);
        }

        @When("I enter lastname {string}")
        public void enter_lastname(String lname) {
            register.enterLastName(lname);
        }

        @When("I enter unique email")
        public void enter_unique_email() {
            uniqueEmail = "user" + System.currentTimeMillis() + "@test.com";
            register.enterEmail(uniqueEmail);
        }

        @When("I enter password {string}")
        public void enter_password(String pass) {
            register.enterPassword(pass);
        }

        @When("I enter confirm password {string}")
        public void enter_confirm_password(String pass) {
            register.enterConfirmPassword(pass);
        }

        @Then("I should see the registration success message {string}")
        public void i_should_see_the_registration_success_message(String expected) {
            Assert.assertEquals(register.getRegistrationSuccessMessage(), expected);
        }
    }


