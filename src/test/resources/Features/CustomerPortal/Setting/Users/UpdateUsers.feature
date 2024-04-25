Feature: Edit Customer Users

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
    When Click on the kebab menu
    And Click on Edit option on the action popup
    Then Verify that the edit user page should have a proper page header
  
  
  #Possitive testcases
  Scenario: The customer will modify the user with valid inputs
   When Modify all the required fields
   And Click on update button
   Then Verify the user should be updated with the confirmation message 
   And Verify that the updated user is displayed in the user list
   When Click on the MyProfile icon
   And Click on the logout 
   Then Make sure the customer should successfully logout from the customer portal with the confirmation 
   And Close the browser