Feature: Test diffetent actions on a sandbox page
Scenario: As a Test Engineer, I try out different actions on a sandbox page
    Given I navigate to the sandbox
    And Select a value from the dropdown

Scenario: As a Test Engineer, I want to retrieve the value of an static table
    Given I navigate to the static table
    Then I can return the value I wanted


Scenario: As a Test Engineer, I want to validate the static table is displayed.
    Given I navigate to the static table
    Then I can validate the table is displayed

Scenario: As a Test Engineer, I want to validate that a text is present inside the list.
    Given I navigate to the list page
    When I search the list
    Then I can find the text in the list