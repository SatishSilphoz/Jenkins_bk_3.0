Feature: Bookkeeping CIS

  Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module

  @CIS @Regression
  Scenario: Verify CIS dropdown
    Given Enter into client
    Given Click on CIS drop down and verify CIS dropdown list displayed or not
    Given Click on Subcontractor
    And Click on Add Subcontractor
    And Enter all manditory fields and click on save and verify subcontractor added successfully or not

  @CIS @Regression
  Scenario: Verify Select Action dropdown in SubContractor
    Given Enter into client
    Given Click on CIS drop down and verify CIS dropdown list displayed or not
    Given Click on Subcontractor
    When Click on Actions dropdown in Subcontractor
    Given Click on Edit subcontractor
    And Click on save
    When Click on Actions dropdown in Subcontractor
    Given Click on Download certificate and verify certificate downloaded successfully or not

  @CIS @Regression
  Scenario: Verify purchase drop down
    Given Enter into client
    Given Validate Click on Purchase
    Given Click on Purchases
    And Click on New Purchase button it should it should display Create new purchase page and create purchase items
    When Select Purchase Type as CIS Invoice and Select supplier as subcontractor created and enter all manditory fields and click on Save and Close

  @CIS @Regression
  Scenario: Verify Add Payment in select action drop down using cash in hand or bank
    Given Enter into client
    Given Validate Click on Purchase
    Given Click on Purchases
    When Click on Select Action dropdown
    Given Click on Select Action drop down and Select Add payment
    Given Select Account type as cash in hand or bank and Enter some amount and all manditory fields and click on Save
    Given Click on Select Action drop down and Select Add payment
    And Select Account type as CIS Control account and Enter total balance amount and all manditory fields and click on Save

  @CIS @Regression
  Scenario: Verify CIS dropdown after creating CIS purchase
    Given Enter into client
    Given Click on CIS drop down and verify CIS dropdown list displayed or not
    Given Click on CIS300
    And Click on Add CIS Monthly Return
    And Select required fields and submit to capium
    And Verify CIS Monthly Return created successfully or not

  @CIS @Regression
  Scenario: Verify Edit in Select Action drop down in Add CIS Monthly Return
    Given Enter into client
    Given Click on CIS drop down and verify CIS dropdown list displayed or not
    Given Click on CIS300
    When Click on CIS Action dropdown
    Given Click on CISEdit
    And Change manditory fields as required and submit to capium
    When Click on CIS Action dropdown
    Given Click on Download Detail and verify CIS300 Monthly Return downloaded successfully or not
    When Click on CIS Action dropdown
    Given Click on SMS and verify New SMS page displayed or not

  @CIS @Regression
  Scenario: Verify CIS Submission Report
    Given Enter into client
    Given Click on CIS drop down and verify CIS dropdown list displayed or not
    Given Click on Reports
    Given Click on CIS Submission report
    And Click on pdf icon and verify pdf downloaded successfully or not
    And Click on period and click on pdf icon and verify downloaded successfully or not

  @CIS @Regression
  Scenario: Verify Subcontractor Contractor YTD Details Report
    Given Enter into client
    Given Click on CIS drop down and verify CIS dropdown list displayed or not
    Given Click on Reports
    Given Click on Subcontractor YTD Details
    And Select Subcotractor,period and from and to date and verify records displaying or not
    And Click on Export>>Export as pdf and verify pdf exported successfully or not
    And Click on Export>>Export as excel and verify excel exported successfully or not

  @CIS @Regression
  Scenario: Verify CIS Invoice report
    Given Enter into client
    Given Click on CIS drop down and verify CIS dropdown list displayed or not
    Given Click on Reports
    Given Click on CIS Invoice and verify CIS Invoice page displaying or not
    And Select subcontractor,period,from and to date and click on search and verify records displaying successfully or not

  @CIS @Regression
  Scenario: Verify Contractor Settings
    Given Enter into client
    Given Click on CIS drop down and verify CIS dropdown list displayed or not
    Given Click on Contractor Settings and verify Contractor Settings page displaying successfully or not
