#noinspection CucumberPlusUndefinedStep
Feature: Login functionality

  Scenario: User should navigate to login page successfully
    #noinspection CucumberPlusUndefinedStep
    Given I am on the home page
    When I click on login link
    Then I should see "Welcome, Please Sign In!"

  Scenario: Verify error message with invalid credentials
    Given I am on the home page
    When I click on login link
    And I enter email "deep@gmail.com"
    And I enter password "123456"
    And I click login button
    Then I should see error message "Login was unsuccessful"

  Scenario: User should login successfully with valid credentials
    Given I am on the home page
    When I click on login link
    And I enter email "test@gmail.com"
    And I enter password "Test1234"
    And I click login button
    Then logout link should be displayed

  Scenario: User should logout successfully
    Given I am logged in with valid credentials
    When I click logout link
    Then login link should be displayed
