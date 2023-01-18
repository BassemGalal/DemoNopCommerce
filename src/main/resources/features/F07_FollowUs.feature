@smoke
Feature: F07_FollowUs

  Scenario:1- user opens facebook link
    Given user click facebook button
    And check new tab is opened "https://www.facebook.com/nopCommerce"

  Scenario:2- user opens twitter link
    Given user click twitter button
    And check new tabT is opened "https://twitter.com/nopCommerce"

Scenario: 3- user opens youtube link
  Given user click youtube button
  And check new tabY is opened "https://www.youtube.com/user/nopCommerce"

  Scenario: 4- user opens srs link
    Given user click srs button
    And check new tabS is opened "https://demo.nopcommerce.com/new-online-store-is-open"
