@MustRun
Feature: Test Tags

  @SmokeTest
  Scenario : sample1
    Given
    And
    When
    And
    Then

  @RegressionTest
  Scenario : sample2
    Given
    And
    When
    And
    Then

  @SmokeTest @RegressionTest
  Scenario : sample3
  Given
  And
  When
  And
  Then

  @Important
  Scenario : sample4
  Given
  And
  When
  And
  Then