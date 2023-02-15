Feature: Login functionality feature

  @SmokeTest
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When User enters "username" and <password>
    And User clicks on Login
    Then user is navigated to the home page

    Examples:
      | username | password |
      | Raghav   | 12345    |
      | Ele      | 12345    |
