Feature: Customer Signin Functionality

   Background: 
    Given Customer launch the browser 
    When Enter a url as "https://xsquare-customer.tech-active.com/"


   Scenario: Customer login with valid credentials
    When Enter valid email as "anil@techactive.io" and password as "Anil1234@#"
    And Click on a signin button
    Then Verfy the customer should be redirected to the customer dashboard with the confirmation Message
    When Click on the MyProfile icon
    And Click on the logout 
    Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    And Close the browser
    
   #Scenario: Customer login with invalid credentials
    #When Enter invalid email as "anilmail.com" and invalid password as "8521"
    #And Click on a signin button
    #Then Verify the proper error message should be displayed
    #And Close the browser
    
   #Scenario: Customer login with empty fields
    #When Keep email and password fields as empty
    #And Click on a signin button
    #Then Verify the proper error message should be displayed
    #And Close the browser
    
   #Scenario: Customer login with valid email and invalid password
    #When Enter valid email as "anil@techactive.io" and invalid password as "password"
    #And Click on a signin button
    #Then Verify the proper error message should be displayed
    #And Close the browser
    
   #Scenario: Customer login with invalid email and valid password
    #When Enter invalid email as "anigfltechactive.io" and valid password as "Anil1234@#"
    #And Click on a signin button
    #Then Verify the proper error message should be displayed
    #And Close the browser
    
   #Scenario: Customer login without email
    #When Keep email field as empty 
    #And Enter password as "1234"
    #And Click on a signin button
    #Then Verify the proper error message should be displayed
    #And Close the browser 
    
   #Scenario: Customer login without password
    #When Enter email as "anil@techactive.io" 
    #And Keep password field as empty
    #And Click on a signin button
    #Then Verify the proper error message should be displayed
    #And Close the browser
    
    #Scenario: Customer tries to login with unregistered credentials
    #When Enter unregistered email as "anilsdf@gmail.com" and password as "Anil1234@#"
    #And Click on a signin button
    #Then Make sure that the proper error message should be displayed
    #And Close the browser
    
    
    
       