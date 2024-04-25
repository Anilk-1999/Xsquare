Feature: Customer User Home Page

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
    

   Scenario: The customer will filter the active customer user list
     When Click on the filter button
     And Select the active status
     And Click on submit button
     Then Verify that Only active users should be displayed in the user list
     When Click on the MyProfile icon
     And Click on the logout 
     Then Make sure the customer should successfully logout from the customer portal with the confirmation 
     And Close the browser
     
   Scenario: The customer will filter the inactive customer user list
     When Click on the filter button
     And Select the inactive status
     And Click on submit button
     Then Verify that Only inactive users should be displayed in the user list
     When Click on the MyProfile icon
     And Click on the logout 
     Then Make sure the customer should successfully logout from the customer portal with the confirmation 
     And Close the browser  
     
   Scenario: The customer will searching customer user
     When Enter the customer user name into search field and click on enter key
     Then Verify that the searched user name should be displayed in the user list  
     When Click on the MyProfile icon
     And Click on the logout 
     Then Make sure the customer should successfully logout from the customer portal with the confirmation 
     And Close the browser
     