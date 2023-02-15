Feature: Background functionality feature

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And user clicks on login
    Then user is navigated to the home page

  Scenario: sample1
    When User clicks on welcome link
    Then logout link is displayed

  Scenario: sample2
    When User clicks on dashboard link
    Then click launch toolbar is displayed