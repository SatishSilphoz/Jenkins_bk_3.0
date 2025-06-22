Feature: Contacts

  Background: User login
   Given Launch the browser
  And User need to enter the Application Url
  When User Enter username and Password
  Then User Click on login button
  And redirect to Bookkeeping module
@Contacts @Regression
  Scenario: Add Customers to Contacts
    Given Enter into client
    Given Click on Contacts
    When Click on Customers
    And Click on Add Coustomer enter required fields click on save
    Then Validate Coustomer Created or not
    And Click on Export button
    And Click on as PDF
    And Click on Export button
    And Click on as Excel
@Contacts @Regression
  Scenario: Add Supplier to Contacs
    Given Enter into client
    Given Click on Contacts
    When Click on Supplier
    And Click on Add Supplier enter required fields click on save
    Then Validate Supplier Created or not
    And Click on Export button
    And Click on as PDF
    And Click on Export button
    And Click on as Excel
#@Contacts @Regression
  Scenario: Add Director to Contacts
    Given Enter into client
    Given Click on Contacts
    When Click on Directors
    And Click on Add Director enter required fields click on save
    Then Validate Director Created or not
    And Click on Directors Export button
    And Click on as PDF

@Contacts @Regression
  Scenario: Add Shareholder to Contacts
    Given Enter into client
    Given Click on Contacts
    Given Click on Shareholder
    When Click on Add Shareholder enter required fields click on save
    Then Validate Shareholder Created or not
    And Click on Export button
    And Click on as PDF
  
