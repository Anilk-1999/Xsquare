Feature: View Beneficiaries

   Background: 
    Given The customer launch the browser
    And Enter a url as "https://xsquare-customer.tech-active.com/"
    And Enter a email as "anil@techactive.io" and password as "1234"
    And Click on a signin button
    Then Verfy the customer should be redirected to the customer dashboard with the confirmation Message
    When the customer clicks on the Beneficiaries option in the side menu
    Then Verify the customer should be redirected into beneficiaries page
    When Select beneficiary in the list
    Then Verify that the customer should be redirect into view beneficiary page  
    
    
   Scenario: The Verifier verify the beneficiary approve matrix
    Then Verify the beneficiary status
    When Click on the approve verification button
    And Click on the Ok button in the confirmation popup
    Then Make sure that the beneficiary status should be update in the list with the confirmation message
    When Click on the MyProfile icon
    And Click on the logout 
    Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    And Close the browser
    
   Scenario: The verifier reject the beneficiary approve matrix
    Then Verify the beneficiary status
    When Click on the reject verification button
    And Enter the resion into resion textfield
    And Click on the Ok button in the confirmation popup
    Then Make sure that the beneficiary status should be update in the list with the confirmation message
    When Click on the MyProfile icon
    And Click on the logout 
    Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    And Close the browser
    
   Scenario: The approver approve the beneficiary approve matrix
    Then Verify the beneficiary status
    When Click on the Approve beneficiary button
    And Click on the Ok button in the confirmation popup
    Then Make sure that the beneficiary status should be update in the list with the confirmation message
    When Click on the MyProfile icon
    And Click on the logout 
    Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    And Close the browser
    
    Scenario: The approver reject the beneficiary approve matrix
    Then Verify the beneficiary status
    When Click on the reject beneficiary button
    And Enter thee resion into resion textfield
    And Click on the Ok button in the confirmation popup
    Then Make sure that the beneficiary status should be update in the list with the confirmation message
    When Click on the MyProfile icon
    And Click on the logout 
    Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    And Close the browser
    
    
    
    	