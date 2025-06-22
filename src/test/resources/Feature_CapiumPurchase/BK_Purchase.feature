Feature: Bookkeeping Purchases

  Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module

  @Purchase @Regression
  Scenario: Purchase Dashboard - Purchase summary
    Given Enter into client
    Given Validate Click on Purchase
    And Click Dashboard in Purchase
    And Validate Purchases summary board
    And Click on Purchases button it should navigate to Create New Purchase page
    And Redirect to Purchase dashboard page
    And Click on Supplier button it should navigate to Contact list page
    And Redirect to Purchase dashboard page
    When Click on All Purchases link it should navigate to purchases page
    And Redirect to Purchase dashboard page
    And Click on All Supplier link it should navigate to Contact list page
    Then Redirect to Purchase dashboard page

  @Purchase @Regression
  Scenario: Purchase Dashboard
    Given Enter into client
    Given Validate Click on Purchase
    And Click Dashboard in Purchase
    And Validate Purchases chart
    When Validate Creditors Chart
    And Validate Current Creditors list
    Then Click on All creditors link it should navigate to creditors list page
    And Redirect to Purchase dashboard page
    And Validate Recent Purchases list
    And Click on All purchaes link in Recent Purchase list it should navigate to Purchases page
    And Redirect to Purchase dashboard page

  @Purchase @Regression
  Scenario: Purchases Page
    Given Enter into client
    Given Validate Click on Purchase
    Given Click on Purchases
    And Click on New Purchase button it should it should display Create new purchase page and create purchase items
    When Create Purchase Invoice

  @Purchase @Regression
  Scenario: Verify Purchase Type dropdown
    Given Enter into client
    Given Validate Click on Purchase
    And Click Dashboard in Purchase
    And Click on Purchases
    When Click on Purchase type dropdown
    Then Select each type from dropdown

  @Purchase @Regression
  Scenario: Verify Action dropdown in purchase
    Given Enter into client
    Given Validate Click on Purchase
    And Click Dashboard in Purchase
    When Click on Select Action dropdown
    And Click on Edit

  @Purchase @Regression
  Scenario: Purchases Export
    Given Enter into client
    Given Validate Click on Purchase
    And Click on Purchases
    When click on Export
    And Click Export as PDF
    Then click on Export
    And Click Export as Excel

  @Purchase @Regression
  Scenario: CapiScan
    Given Enter into client
    Given Validate Click on Purchase
    Then Click on Capiscan

  @Purchase @Regression
  Scenario: Recuring Purchases
    Given Enter into client
    Given Validate Click on Purchase
    When Click on Recuring Purchases
    And Click on Add Recuring Purchase
    And Enter the recuring purchase details
    Then Click on Save and close

  @Purchase @Regression
  Scenario: Recuring purchase
    Given Enter into client
    Given Validate Click on Purchase
    When Click on Recuring Purchases
    And Click on Add Recuring Purchase
    And Enter the recuring purchase details
    Then Click on Save and New

 @Purchase @Regression
  Scenario: Recuring Purchase Search
    Given Enter into client
    Given Validate Click on Purchase
    When Click on Recuring Purchases
    And Enter supplier name in Search area
    Then Click on search button

  @Purchase @Regression
  Scenario: Purchase Payments
    Given Enter into client
    Given Validate Click on Purchase
    When Click on Payments
    And Click on Add payment
    And Add supplier from dropdown
    Then Enter amount
    Then Click on Payments Save and close

  @Purchase @Regression
  Scenario: Purchase Payments
    Given Enter into client
    Given Validate Click on Purchase
    When Click on Payments
    And Click on Add payment
    And Add supplier from dropdown
    And Click on Checkbox Make advance payment
    Then Click on Payments Save and close

  @Purchase @Regression
  Scenario: Purchase Edit Payments
    Given Enter into client
    Given Validate Click on Purchase
    When Click on Payments
    And Click on Add payment
    And Add supplier from dropdown
    And Click on Payments Save and New

  @Purchase @Regression
  Scenario: Purchase Import
    Given Enter into client
    Given Validate Click on Purchase
    Given Click on Purchases
    And Click on Import button
    When Click on Download template file
    And Upload the file
    And After Upload click on Import
    And Click on process import
    And Click on continue button
    And Click on checkbox and approved
    Then Click on Conformation OK
    And Open created puchase and verify
