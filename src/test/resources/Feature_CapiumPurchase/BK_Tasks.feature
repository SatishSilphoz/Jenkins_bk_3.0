Feature: BookkeepingModule-Task

  Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module

  @Task @Regression
  Scenario: Tasks Journals
    Given Navigate to Tasks section
    And Click on Journals
    When Click on Add New journal
    And Enter the data requried for journals
    Then Click on Save and Close

  #@Task @Regression
  #Scenario: Task Journals
  #Given Navigate to Tasks section
  #And Click on Journals
  #When Click on Add New journal
  #And UnTick the checkbox Including VAT
  #And Enter the data requried for journals
  #Then Click on Save and Close
  @Task @Regression
  Scenario: Task Journals Select Edit Action
    Given Navigate to Tasks section
    And Click on Journals
    When Click on Select Action dropdown in journals
    And Click on Journal Edit
    And Add rows to the journal and verify the total debit and credit matching
    Then Click on Save and Close

  @Task @Regression
  Scenario: Task Journals Select PDF Action
    Given Navigate to Tasks section
    And Click on Journals
    When Click on Select Action dropdown in journals
    Then Click on PDF

  @Task @Regression
  Scenario: Task Journals Select Excel Action
    Given Navigate to Tasks section
    And Click on Journals
    When Click on Select Action dropdown in journals
    Then Click on Excel

  @Task @Regression
  Scenario: Task Journals Select Copy Action
    Given Navigate to Tasks section
    And Click on Journals
    When Click on Select Action dropdown in journals
    Then Click on Copy

  @Task @Regression
  Scenario: Task Journals Select Delete Action
    Given Navigate to Tasks section
    And Click on Journals
    When Click on Select Action dropdown in journals
    And Click on Delete
    Then Verify the Delete Confirmation message and click on OK button

  @Task @Regression
  Scenario: Task Budgeting
    Given Navigate to Tasks section
    And Click on Budgeting
    And Click on Add New Budget and Create Budgeting for different periods
    Then Verify the all Budgeting periods

  @Task @Regression
  Scenario: Task Budgeting Edit Action
    Given Navigate to Tasks section
    And Click on Budgeting
    When Click on Action dropdown
    Then Click on Edit Action
    And Update the data by adding include

  @Task @Regression
  Scenario: Task Budgeting Delete Action
    Given Navigate to Tasks section
    And Click on Budgeting
    When Click on Action dropdown
    Then Click on Delete Action
    Then Verify the Delete Confirmation message and click on OK button

  @Task @Regression
  Scenario: Task Dividends
    Given Navigate to Tasks section
    And Click on Dividends
    And Add Dividends
    When Add Shareholder and enter required data
    Then Click on Save

  @Task @Regression
  Scenario: Task Dividends filter
    Given Navigate to Tasks section
    And Click on Dividends
    When Click on Filetr by dropdown
    Then Validate each value in dropdown

  @Task @Regression
  Scenario: Task Dividends Search
    Given Navigate to Tasks section
    And Click on Dividends
    Then Search for dividends

  @Task @Regression
  Scenario: Task Bulk Edit
    Given Navigate to Tasks section
    And Click on BulkEdit
