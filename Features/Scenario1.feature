#Sample Feature Definition Template
@tag
Feature: Westpac KiwiSaver Test Scenario 1

  @tag1
  Scenario: To test Help Icon of Current Age
    Given I want to navigate to Westpac NZ
    And Navigate to Calculator form page
    When I click on the help icon next to Current age textbox
    Then Help Messgae is shown on page
