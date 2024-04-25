Feature: Beneficiary creation

  Background: 
    Given Customer launch the browser
    And Enter a url as "https://xsquare-customer.tech-active.com/"
    And Enter valid email as "anil@techactive.io" and password as "Anil123@#"
    And Click on a signin button
    Then Verfy the customer should be redirected to the customer dashboard with the confirmation Message
    When The customer clicks on the Beneficiaries option in the side menu
    Then Verify the customer should be redirected into beneficiaries home page
    When Click on Add Beneficiary button
    Then Verify that the add beneficiary page should have a proper page header

  #Positive test cases  
  Scenario: Customer will create a new beneficiary with valid data
    When Enter all the required data
    And Click on submit button
    Then Verify the beneficiary should be created with the confirmation message 
    And Verify that the customer should be redirected into customer home page
    And Verify that the newly created beneficiary is displayed in the list
    When Click on the MyProfile icon
    And Click on the logout
    Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    And Close the browser
    
  #Nagative test cases  
  #Scenario: Customer will try to create an new beneficiary with empty data 
    #When Keep all the required fields are empty
    #And Click on submit button
    #Then Make sure that all the mandatory fields should get highlighted with the proper error message 
    #When Click on the MyProfile icon
    #And Click on the logout 
    #Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    #And Close the browser 
    
  #Scenario: Customer will create a inactive beneficiary with valid data
    #When Enter all the required data
    #And Click on submit button
    #And Click on the Ok button in the confirmation popup
    #Then Verify the beneficiary should be created with the confirmation message 
    #And Verify that the customer should be redirected into customer home page
    #And Verify that the newly created inactive beneficiary is displayed in the list
    #When Click on the MyProfile icon
    #And Click on the logout 
    #Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    #And Close the browser
    #
  #Scenario: Customer Cancels New Beneficiary Creation Process
    #When Enter all the required data
    #And Click on cancel button
    #Then Verify that the customer should be redirected to the beneficiary home page
    #When Click on the MyProfile icon
    #And Click on the logout 
    #Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    #And Close the browser
    
      
    
    
    