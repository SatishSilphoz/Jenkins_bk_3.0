Feature: ClientCreation

  Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module

  @ClientCreation @Regression
  Scenario: Client creation page
    Given client Create in Bookkeeping
    Then Verify the client created or not
