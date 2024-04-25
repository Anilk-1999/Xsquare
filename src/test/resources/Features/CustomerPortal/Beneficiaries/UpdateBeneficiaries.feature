Feature: Beneficiary Updations

   Background: 
    Given The customer launch the browser
    And Enter a url as "https://xsquare-customer.tech-active.com/"
    And Enter a email as "anil@techactive.io" and password as "1234"
    And Click on a signin button
    Then Verfy the customer should be redirected to the customer dashboard with the confirmation Message
    When the customer clicks on the Beneficiaries option in the side menu
    Then Verify the customer should be redirected into beneficiaries page
    When Select beneficiary in the list
    And Click on the kebab menu
    And Click on the edit option on the action popup
    Then Verify that the edit beneficiary page should have a proper page header

   #positive testcases
   Scenario: Customer will update the existing customer details
     When Modify the required fields
     And Upload the KYC document
     And Click on submit button
     And Click on the Ok button in the confirmation popup
     Then Verify the beneficiary should be Updated with the confirmation message
     And Verify that the customer should be redirected to the beneficiary home page
     When Click on the MyProfile icon
     And Click on the logout 
     Then Make sure the customer should successfully logout from the customer portal with the confirmation 
     And Close the browser
     
   #Nagative testcases  
   Scenario: Customer Cancels Beneficiary updating Process
     When Modify the required fields
     And Click on cancel button
     Then Verify that the customer should be redirected to the beneficiary home page
     When Click on the MyProfile icon
     And Click on the logout 
     Then Make sure the customer should successfully logout from the customer portal with the confirmation 
     And Close the browser
     
   Scenario: Customer will try to update beneficiary with empty data 
    When Keep all the required fields are empty
    And Click on submit button
    Then Make sure that all the mandatory fields should get highlighted with the proper error message 
    When Click on the MyProfile icon
    And Click on the logout 
    Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    And Close the browser    
   
   Scenario: Customer make the active beneficiary to inactive beneficiary
     When Modify the required fields 
     And Change the status from active to inactive 
     And Click on submit button
     And Click on the Ok button in the confirmation popup
     Then Verify the beneficiary should be Updated with the confirmation message
     And Verify that the customer should be redirected into customer home page
     And Verify that the inactive beneficiary should be displayed in the list
     When Click on the MyProfile icon
     And Click on the logout 
     Then Make sure the customer should successfully logout from the customer portal with the confirmation 
     And Close the browser 
   
   