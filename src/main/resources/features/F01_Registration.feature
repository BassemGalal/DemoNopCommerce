@smoke
Feature: F01_Registration | guest users could create new accounts
  # Positive Scenario
  Scenario: user could create new account with valid data
    Given user go to register page
    When user select gender type
    And user enter "automation" & "tester"
    And user select date of birth
    And user enter email"Project@sprints.com"
    And user enter password and confirm password "123456"
    And user click on register button
    Then account is created successfully

