Feature: Login feature

  Scenario: Login Success
    Given I open Login page
    When I enter email "demo@class.com"
    And I enter password "te$t$tudent"
    And I submit
    And I double click the first user playlist
    When I enter the new playlist name
    Then the playlist name is edited
