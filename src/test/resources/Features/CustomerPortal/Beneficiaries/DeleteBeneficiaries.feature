Feature: Beneficiary deletion

  Background: 
    Given The customer launch the browser
    When Enter a url as "https://xsquare-customer.tech-active.com/"
    And Enter a email as "anil@techactive.io" and password as "1234"
    And Click on a signin button
    Then Verfy the customer should be redirected to the customer dashboard with the confirmation Message
    When the customer clicks on the Beneficiaries option in the side menu
    Then Verify the customer should be redirected into beneficiaries page
    When Select beneficiary in the list
    Then Verify that the customer should be redirect into view beneficiary page


  Scenario: Customer will delete the beneficiaries
    When Click on the kebab menu 
    And Click on the delete option in the action popup
    And Click on the Ok button in the confirmation popup
    Then Verify that the customer should be redirected to the beneficiary home page
    And Verify the deleted beneficiary is displayed in the list
    When Click on the MyProfile icon
    And Click on the logout 
    Then Make sure the customer should successfully logout from the customer portal with the confirmation 
    And Close the browser
   
     