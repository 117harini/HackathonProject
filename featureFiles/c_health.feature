Feature: Third requirement

  @sanity @regression
  Scenario: Health insurance
    Given User navigates to home page
    When User hovers on Insurance products
    Then All health insurance menu items are displayed
