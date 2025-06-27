Feature: Schedule

  Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module

  Scenario: Schedule functionality
  Given Enter into client
    Given Validate schedule
    Then Validate minutes of meetings
    And Validate Notes
