Feature: Beneficiary home page

  Background: 
    Given The customer launch the browser
    And Enter a url as "https://xsquare-customer.tech-active.com/"
    And Enter a email as "anil@techactive.io" and password as "1234"
    And Click on a signin button
    Then Verfy the customer should be redirected to the customer dashboard with the confirmation Message
    When the customer clicks on the Beneficiaries option in the side menu
    Then Verify the customer should be redirected into beneficiaries page
    
  Scenario: Search the beneficiary by name
    When Enter the name into search field
    And Click on enter
    Then Make sure that the searched name should displayed in the table
    When Click on the MyProfile icon
    And Click on the logout 
    Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    And Close the browser
    
  Scenario: Filter the beneficiaries based on date
    When Click on the filter button
    And Enter date into date field
    And Select the beneficiary
    And Click on the submit button
    Then Make sure that the filtered beneficiary list should be displayed in the table
    When Click on the MyProfile icon
    And Click on the logout 
    Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    And Close the browser
    
  Scenario: Filter the beneficiaries based on status
    When Click on the filter button
    And Enter date into date field
    And Select the status
    And Select the beneficiary
    And Click on the submit button
    Then Make sure that the filtered beneficiary with status list should be displayed in the table
    When Click on the MyProfile icon
    And Click on the logout 
    Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    And Close the browser 
    
  Scenario: Customer can load more records in the list  
    When Click on the load more button
    Then verify the records in the beneficiary list
    When Click on the MyProfile icon
    And Click on the logout 
    Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    And Close the browser    
    