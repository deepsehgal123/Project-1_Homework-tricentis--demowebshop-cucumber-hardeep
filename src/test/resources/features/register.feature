#noinspection CucumberPlusUndefinedStep
Feature: Register functionality

@sanity
  Scenario: User should navigate to register page successfully
    When I click on register link
    Then I should see register text
    
@smoke
  Scenario: Validate mandatory fields
    When I click on register link
    And I click register button
    Then I should see firstname error
    And I should see lastname error
    And I should see email error
    And I should see password error
    And I should see confirmPassword error
    
@regression
  Scenario: User should create account successfully
    When I click on register link
    And I select gender "Female"
    And I enter firstname "Priya"
    And I enter lastname "Sharma"
    And I enter email "test123@gmail.com"
    And I enter password "Test1234"
    And I enter confirm password "Test1234"
    And I click register button
    Then I should see message "Your registration completed"
