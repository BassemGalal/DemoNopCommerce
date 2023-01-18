@smoke
Feature: User could login after success registration
  Scenario: user can login with valid data
    Given user go to login page
    When user enter valid email "Project@sprints.com"
    And user enet valid password "123456"
    And user click on login button
    Then check that login successfully
    And user can logout
    And check that logout successfully