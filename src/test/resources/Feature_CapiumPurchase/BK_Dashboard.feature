Feature: Bookkeeping dashboard

  Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module

  @Dashboard @Regression
  Scenario: Dashboard functionality
    Given Validate RefreshButton in VAT Summery which is at Right Side
    And Validate Returns in previous month which is in VAT Summery
    And Validate Minimise in VAT Summery
    And Validate Add Client
    Then Validate Add Client Page
    And Validate All Clients
    And Validate Client Type
    And Validate Text search
    And Validate Vat client
    And Validate Month in VAT Clients
    And Validate VAT Status
    And Validate Payment Status
    And Validate Client List
    And Validate First and Previous button
    And Validate Next button
    And Validate Last button
    And Validate Scroll bar
