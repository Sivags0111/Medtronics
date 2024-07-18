Feature: Create an account on Medtronic Diabetes India website

  Scenario: User successfully creates an account
    Given the user is on the Medtronic Diabetes India homepage
    When the user navigates to the "careLink"  page
    And the user fills in the registration form with valid details
    And the user agrees to the terms and conditions
    And the user clicks the "Register" button
    Then the user should see a confirmation message "Account successfully created"
