Feature: Hooks functionality feature

  @SmokeTest
  Scenario: sample1
    Given user is on login page
    When User enters username and password
    And User clicks on Login
    Then user is navigated to the home page

  Scenario: sample2
    Given user is on login page
    When User enters username and password
    And User clicks on Login
    Then user is navigated to the home page