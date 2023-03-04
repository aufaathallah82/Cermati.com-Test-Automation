@Web
Feature: register

  Scenario: register
    Given  user input "email@cermati.com" at search email field
    And user input "08123456789" at search no hp field
    And user input "Abc123!@#" at search password field
    And user input "Abc123!@#" at search repeat password field
    And user input "Aufa" at search surname field
    And user input "Athallah" at search lastname field
    And user input "Jakarta" at search city field