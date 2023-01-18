@smoke
Feature:  F06_homeSliders | users will be able to open sliders in home page
  Scenario: first slider is clickable on home page
  Given user click of first slide
    And check new page is opened

  Scenario: second slider is clickable on home page
    Given user click second slide
    And check new page is opened for second slider