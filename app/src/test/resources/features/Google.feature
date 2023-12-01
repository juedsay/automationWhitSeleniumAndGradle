
Feature: Test Google Search functionality

  
  Scenario: As a user I enter a search cruteria in Google
    Given I am on the Google search page
    When I search for criteria
    And Click on the search button
    Then The results match the criteria
    

#   @regression
#   Scenario: Search something on Google
#     Given I am on the Google search page
#     When I search for "something"
#     And
#     Then I should see "something" in the results

#   @smoke
#   Scenario: Search something on Google
#     Given I am on the Google search page
#     When I search for "something"
#     And
#     Then I should see "something" in the results

#   @regression
# Scenario: Search something on Google
#     Given I am on the Google search page
#     When I search for "something"
#     And
#     Then I should see "something" in the results

