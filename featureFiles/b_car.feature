Feature: Second requirement

  @sanity @regression
  Scenario: Car insurance
    Given User navigates to the home page
    When User clicks on the car insurance
    And User clicks on buy a new car
    And User selects all the car details
    And User enters the name
    And User enters invalid email
    And User enters the mobile number
    Then Error message is displayed
