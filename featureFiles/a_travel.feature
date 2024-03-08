Feature: First requirement

  @sanity @regression
  Scenario: Travel insurance
    Given User opens the browser and navigates to the home page
    When User clicks on the travel insurance
    And User selects the location and choose the date
    And User selects the no.of travellers and their age
    And User selects no and enters the mobile number
    And User selects the student plan and choose travellers
    Then First three travel plans are displayed
