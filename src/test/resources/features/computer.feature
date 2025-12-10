#noinspection CucumberPlusUndefinedStep
Feature: Computer functionalities

@sanity
  Scenario: User should navigate to computers page
    When I click on computers tab
    Then I should see computers text
    
@smoke
  Scenario: User should navigate to desktop page
    When I click on computers tab
    And I click desktops link
    Then I should see desktops text

@regression
  Scenario Outline: User should build computer successfully
    When I click on computers tab
    And I click desktops link
    And I click Build your own computer
    And I select processor "<processor>"
    And I select ram "<ram>"
    And I select hdd "<hdd>"
    And I select os "<os>"
    And I select software "<software>"
    And I click add to cart
    Then I should see message "The product has been added to your shopping cart"

    Examples:
      | processor | ram | hdd | os | software |
      | 2.2 GHz Intel Pentium Dual-Core E2200 | 2 GB | 320 GB | Windows 7 [+50.00] | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Windows 10 [+60.00] | Acrobat Reader [+$10.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB | Ubuntu | Total Commander [+$5.00] |
