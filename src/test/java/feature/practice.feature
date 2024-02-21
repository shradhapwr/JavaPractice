Feature: Bookcart Application Tests
  Scenario: Open a website
    Given I open the website
    When I perform some action
    Then I should see the result
  Scenario:
    Login should be success

    Given User navigates to Bookcart application
    And User clicks on login button
    And user enter the username as urtoni
    And User enter the password as Pass123
    When User clicks on the login button
    Then Login should be success

  Scenario:
  Login should not be success

    Given User navigates to Bookcart application
    And User clicks on login button
    And user enter the username as urtoni
    And User enter the password as Pass21
    When User clicks on the login button
    But Login should not fail