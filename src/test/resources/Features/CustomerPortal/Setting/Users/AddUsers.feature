Feature: Customer User Creation
  
  Background: 
    Given Customer launch the browser
    And Enter a url as "https://xsquare-customer.tech-active.com/"
    And Enter valid email as "anil@techactive.io" and password as "Anil1234@#"
    And Click on a signin button
    Then Verfy the customer should be redirected to the customer dashboard with the confirmation Message
    When Click on the MyProfile icon
    And Clicks on the setting link
    Then Verify that the customer should be redirected to the setting page
    When Clicks on the user tab
    Then Verify the customer should be redirected into user home page
    When Click on the Add new user button
    Then Verify that the add user page should have a proper page header
  
  
  #Possitive testcases
  Scenario: The customer will create a user with valid inputs
   When Enter all the required fields
   And Click on submit button
   Then Verify the user should be created with the confirmation message 
   And Verify that the newly created user is displayed in the user list
   When Click on the MyProfile icon
   And Click on the logout 
   Then Make sure the customer should successfully logout from the customer portal with the confirmation 
   And Close the browser
  
  #Nagative testcases 
  Scenario: The customer will create a inactive user with valid inputs
   When Enter all the required fields
   And Select a inactive status
   And Click on submit button
   Then Verify the user should be created with the confirmation message
   And Veify that the newly created inactive user is displayed in the user list
   When Click on the MyProfile icon
   And Click on the logout 
   Then Make sure the customer should successfully logout from the customer portal with the confirmation 
   And Close the browser
   
  Scenario: The customer will check the validations
   When Keep all the required fields are empty
   And Click on submit button
   Then Make sure that all the mandatory fields should get highlighted with the proper error message
   When Click on the MyProfile icon
   And Click on the logout 
   Then Make sure the customer should successfully logout from the customer portal with the confirmation 
   And Close the browser
   
  Scenario: The Customer Cancels New user Creation Process
   When Enter all the required fields
   And Click on cancel button
   Then Verify that the customer should be redirected to the user home page
   When Click on the MyProfile icon
   And Click on the logout 
   Then Make sure the customer should successfully logout from the customer portal with the confirmation 
   And Close the browser 
     