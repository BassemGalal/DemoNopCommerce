@smoke
Feature: user could search
  Scenario: user can search using items name
    Given user search for item
    And user click search
    Then check that opened site contain
    And check result number more than zero

  Scenario: user can search using SKU
    Given user search by item SKU
    And user click search button
    And check that one item appears
    Then click on this item
    And check that item contain same SKU