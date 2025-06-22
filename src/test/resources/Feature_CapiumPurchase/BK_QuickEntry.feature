Feature: Bookkeeping Quick Entry

  Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module

  @QuickEntry @Regression
  Scenario: Verify QuickEntry Page
    Given Enter into client
    Given Click on QuickEntry and verify QuickEntry page
    Given Click on Add QuickEntry and verify Add Quick Entry page
    When Add Receipt type QuickEntry and verify

  @QuickEntry @Regression
  Scenario: Verify QuickEntry Page
    Given Enter into client
    Given Click on QuickEntry and verify QuickEntry page
    Given Click on Add QuickEntry and verify Add Quick Entry page
    When Add Payment type QuickEntry and verify

  @QuickEntry @Regression
  Scenario: Verify Edit and Add Row in QuickEntry
    Given Enter into client
    Given Click on QuickEntry and verify QuickEntry page
    When Click Edit on Existing QuickEntry
    Then Add row and enter data

  @QuickEntry @Regression
  Scenario: Verify Delete Row in QuickEntry
    Given Enter into client
    Given Click on QuickEntry and verify QuickEntry page
    When Click Edit on Existing QuickEntry
    Then Click on Delete Row
    And Verify Conformatiom message and Click on Ok

  @QuickEntry @Regression
  Scenario: Verify Save and New button
    Given Enter into client
    Given Click on QuickEntry and verify QuickEntry page
    When Click Edit on Existing QuickEntry
    And Click on Save and New button
    Then Enter the data click on save and close

  @QuickEntry @Regression
  Scenario: Verify PDF download
    Given Enter into client
    Given Click on QuickEntry and verify QuickEntry page
    When Go to Action dropdown and click on PDF download

  @QuickEntry @Regression
  Scenario: Verify Delete QuickEntry
    Given Enter into client
    Given Click on QuickEntry and verify QuickEntry page
    When Click on Delete option in Action dropdown
