Feature: I can find a team inside a state.

@List
Scenario Outline: Scenario Outline name: Scenario Outline name: As a Test Engineer, I want to validate that a text is present inside the list.
    Given I navigate to the list page
    When I search <state> in the list
    Then I can find <team> in the list

    Examples:
        |state   |team           |
        |Boston  |Boston Celtics |
        |New York|New York Knicks|